package com.jamqer.imagepool.imageviewer.API;

import com.jamqer.imagepool.imageviewer.Model.Images;
import com.jamqer.imagepool.imageviewer.Model.ImagesResponse;

import java.util.List;
import java.util.Map;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by Piotras on 2015-11-02.
 */
public interface ImageViewerAPI {

    @GET("/api/")
    Call<ImagesResponse> getResponse(@QueryMap Map<String,String> StringMap);

}
