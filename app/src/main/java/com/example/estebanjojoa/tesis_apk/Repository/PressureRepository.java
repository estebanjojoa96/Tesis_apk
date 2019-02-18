package com.example.estebanjojoa.tesis_apk.Repository;

import com.example.estebanjojoa.tesis_apk.ApiRest.RestApiAdapter;
import com.example.estebanjojoa.tesis_apk.ApiRest.Service;
import com.example.estebanjojoa.tesis_apk.Interactor.PressureInteractor;
import com.example.estebanjojoa.tesis_apk.Model.Pressure;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PressureRepository {
    private PressureInteractor pressureInteractor;
    List<Pressure> pressureList;
    public void getDataStadium() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        final Call<List<Pressure>> pressure = service.getDataPressure();
        pressure.enqueue(new Callback<List<Pressure>>() {
            @Override
            public void onResponse(Call<List<Pressure>> call, Response<List<Pressure>> response) {
                pressureList=response.body();
                pressureInteractor = new PressureInteractor();
            }

            @Override
            public void onFailure(Call<List<Pressure>> call, Throwable t) {

            }
        });
    }
}
