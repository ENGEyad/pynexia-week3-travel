package com.pynexia.week3.travel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface WikiApi { @GET("api/rest_v1/page/summary/{title}") Call<WikiSummary> summary(@Path(value="title",encoded=true) String title); }
