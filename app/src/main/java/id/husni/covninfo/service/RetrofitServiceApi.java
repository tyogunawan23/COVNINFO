/*
 * Made With Love
 * Author @Moh Husni Mubaraq
 * Not for Commercial Purpose
 */

package id.husni.covninfo.service;

import java.util.concurrent.TimeUnit;

import id.husni.covninfo.utilities.AppUtils;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitServiceApi {
    private static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .callTimeout(3, TimeUnit.SECONDS)
            .build();
    public static Retrofit getRetrofitService(){
        return new Retrofit.Builder()
                .baseUrl(AppUtils.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public static Retrofit getRetrofitServiceIndo(){
        return new Retrofit.Builder()
                .baseUrl(AppUtils.BASE_URL_INDONESIA)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }
}
