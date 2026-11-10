package com.pynexia.week3.travel;

import com.google.gson.annotations.SerializedName;
public final class WikiSummary {
 public String title,description,extract;
 public Thumbnail thumbnail;
 @SerializedName("content_urls") public ContentUrls contentUrls;
 public static final class Thumbnail { public String source; }
 public static final class ContentUrls { public Desktop desktop; }
 public static final class Desktop { public String page; }
 public String sourceUrl(){return contentUrls!=null&&contentUrls.desktop!=null&&contentUrls.desktop.page!=null?contentUrls.desktop.page:"";}
}
