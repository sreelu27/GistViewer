package com.jldubz.gistaviewer.model.data;

import com.jldubz.gistaviewer.model.gists.Gist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IGitHubService {

    @GET("/gists/public")
        //https://api.github.com/gists/public
    Call<List<Gist>> getPublicGists(@Query("page") int pageNum);

    @GET("/gists")
    Call<List<Gist>> getYourGists(@Query("page") int pageNum);

    @GET("/gists/starred")
    Call<List<Gist>> getStarredGists(@Query("page") int pageNum);

    @GET("/gists/{gistId}")
    Call<Gist> getGistById(@Path("gistId") String gistId);

}