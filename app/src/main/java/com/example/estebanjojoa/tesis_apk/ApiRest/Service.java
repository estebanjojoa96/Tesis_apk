package com.example.estebanjojoa.tesis_apk.ApiRest;

import com.example.estebanjojoa.tesis_apk.Model.Pressure;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET(Constants.URL_GET_PRESSURE)
    Call<List<Pressure>> getDataPressure();
}
