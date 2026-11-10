package com.pynexia.week3.travel;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public final class MainActivity extends ComponentActivity{
 private final List<Destination> all=DestinationCatalog.all();private String category="All";private DestinationAdapter adapter;private EditText search;private TextView count;
 @Override protected void onCreate(Bundle state){super.onCreate(state);setContentView(R.layout.activity_main);search=findViewById(R.id.destinationSearch);count=findViewById(R.id.count);RecyclerView list=findViewById(R.id.destinations);list.setLayoutManager(new LinearLayoutManager(this));adapter=new DestinationAdapter(this::open);list.setAdapter(adapter);for(String c:new String[]{"All","Culture","History","Nature","Coast","City"}){Button b=new Button(this);b.setText(c);b.setAllCaps(false);((LinearLayout)findViewById(R.id.categories)).addView(b);b.setOnClickListener(v->{category=c;filter();});}search.addTextChangedListener(new TextWatcher(){public void beforeTextChanged(CharSequence s,int st,int n,int a){}public void onTextChanged(CharSequence s,int st,int before,int count){filter();}public void afterTextChanged(Editable e){}});filter();}
 private void filter(){String q=search.getText().toString().trim().toLowerCase(Locale.ROOT);List<Destination> matches=new ArrayList<>();for(Destination d:all)if((category.equals("All")||d.category.equals(category))&&(d.name+" "+d.country+" "+d.tagline).toLowerCase(Locale.ROOT).contains(q))matches.add(d);adapter.replace(matches);count.setText(matches.size()+" destinations · select a card for the live guide");}
 private void open(Destination d){Intent i=new Intent(this,DestinationActivity.class);i.putExtra("name",d.name);i.putExtra("country",d.country);i.putExtra("category",d.category);i.putExtra("tagline",d.tagline);i.putExtra("wiki",d.wikiTitle);i.putExtra("image",d.image);startActivity(i);}
}
