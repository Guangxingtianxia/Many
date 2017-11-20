package com.yizijob.www.rxiava2.net;

import com.yizijob.www.rxiava2.entity.LoginRequest;
import com.yizijob.www.rxiava2.entity.LoginResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/5/23  19:37
 * @Desc :
 */

public interface Api
{
    @GET
    Observable<LoginResponse> login(@Body LoginRequest request);

}
