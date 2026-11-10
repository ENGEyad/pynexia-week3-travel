package com.pynexia.week3.travel;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public final class DestinationRepository {
 public interface Callback { void complete(WikiSummary summary,String error); }
 private final WikiApi api=new Retrofit.Builder().baseUrl("https://en.wikipedia.org/").client(new okhttp3.OkHttpClient.Builder().addInterceptor(chain->chain.proceed(chain.request().newBuilder().header("User-Agent","PynexiaTravel/1.0 (https://github.com/ENGEyad/pynexia-week3-travel)").build())).build()).addConverterFactory(GsonConverterFactory.create()).build().create(WikiApi.class);
 public void get(Destination destination,Callback callback){api.summary(destination.wikiTitle.replace(" ","_" )).enqueue(new retrofit2.Callback<WikiSummary>(){
  @Override public void onResponse(retrofit2.Call<WikiSummary> call,retrofit2.Response<WikiSummary> r){if(r.isSuccessful()&&r.body()!=null)callback.complete(r.body(),null);else callback.complete(null,"Travel guide returned HTTP "+r.code()+". You can still open the destination’s Wikipedia page.");}
  @Override public void onFailure(retrofit2.Call<WikiSummary> call,Throwable t){callback.complete(null,"Could not load the guide right now. Check your connection or open the source page.");}
 });}
}
