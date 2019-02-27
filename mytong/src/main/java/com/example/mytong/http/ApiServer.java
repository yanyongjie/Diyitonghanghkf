package com.example.mytong.http;

import com.example.mytong.beans.HttpResponse;
import com.example.mytong.beans.ListNewsChannel;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiServer {
    @POST("")
    @Headers("")
    Observable<HttpResponse<ListNewsChannel>>getListNewsChannl(@Body RequestBody requestBody) ;
}
