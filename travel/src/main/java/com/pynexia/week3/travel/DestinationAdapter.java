package com.pynexia.week3.travel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;
public final class DestinationAdapter extends RecyclerView.Adapter<DestinationAdapter.Holder>{
 public interface Listener{void open(Destination d);}
 private final List<Destination> items=new ArrayList<>();private final Listener listener;
 DestinationAdapter(Listener l){listener=l;}
 void replace(List<Destination> values){items.clear();items.addAll(values);notifyDataSetChanged();}
 @NonNull @Override public Holder onCreateViewHolder(@NonNull ViewGroup p,int t){return new Holder(LayoutInflater.from(p.getContext()).inflate(R.layout.row_destination,p,false));}
 @Override public void onBindViewHolder(@NonNull Holder h,int pos){Destination d=items.get(pos);h.name.setText(d.name);h.country.setText(d.country+"  ·  "+d.category);h.tagline.setText(d.tagline);Glide.with(h.image).load(d.image).centerCrop().placeholder(R.drawable.card).error(R.drawable.card).into(h.image);h.itemView.setOnClickListener(v->listener.open(d));}
 @Override public int getItemCount(){return items.size();}
 static final class Holder extends RecyclerView.ViewHolder{final TextView name,country,tagline;final ImageView image;Holder(View v){super(v);name=v.findViewById(R.id.placeName);country=v.findViewById(R.id.placeCountry);tagline=v.findViewById(R.id.placeTagline);image=v.findViewById(R.id.placeImage);}}
}
