package com.jldubz.gistaviewer.model.data;

import com.jldubz.gistaviewer.model.gists.Gist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IGitHubService {

    @GET("/gists/public")
        //https://api.github.com/gists/public
    Call<List<Gist>> getPublicGists();

    @GET("/gists")
    Call<List<Gist>> getYourGists();

    @GET("/gists/starred")
    Call<List<Gist>> getStarredGists();

}