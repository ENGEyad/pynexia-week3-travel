package com.pynexia.week3.travel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import com.bumptech.glide.Glide;
public final class DestinationActivity extends ComponentActivity{
 private final DestinationRepository repo=new DestinationRepository();private String wiki;
 @Override protected void onCreate(Bundle state){super.onCreate(state);setContentView(R.layout.activity_destination);Intent i=getIntent();String name=i.getStringExtra("name"),country=i.getStringExtra("country");wiki=i.getStringExtra("wiki");((TextView)findViewById(R.id.detailName)).setText(name);((TextView)findViewById(R.id.detailCountry)).setText(country+"  ·  "+i.getStringExtra("category"));((TextView)findViewById(R.id.detailTagline)).setText(i.getStringExtra("tagline"));Glide.with(this).load(i.getStringExtra("image")).centerCrop().placeholder(R.drawable.card).error(R.drawable.card).into((ImageView)findViewById(R.id.detailImage));Button open=findViewById(R.id.openGuide);open.setOnClickListener(v->startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/"+Uri.encode(wiki.replace(" ","_"))))));findViewById(R.id.guideProgress).setVisibility(View.VISIBLE);repo.get(new Destination(name,country,"", "",wiki,""),(summary,error)->runOnUiThread(()->{if(isFinishing())return;findViewById(R.id.guideProgress).setVisibility(View.GONE);TextView extract=findViewById(R.id.extract);TextView attribution=findViewById(R.id.attribution);if(summary!=null){extract.setText(summary.extract==null?"Open the source guide for more information.":summary.extract);attribution.setText("Wikipedia contributors · CC BY-SA. See the source for details and image attribution.");if(summary.thumbnail!=null&&summary.thumbnail.source!=null)Glide.with(this).load(summary.thumbnail.source).centerCrop().placeholder(R.drawable.card).error(R.drawable.card).into((ImageView)findViewById(R.id.detailImage));}else{extract.setText(DestinationCatalog.offlineGuide(name));attribution.setText("Curated destination overview. Open Wikipedia for current information. Cover photo: Unsplash.");}}));}
}
