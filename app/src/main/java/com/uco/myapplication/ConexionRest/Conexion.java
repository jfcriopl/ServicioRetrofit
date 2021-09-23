package com.uco.myapplication.ConexionRest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Conexion {

    private static Retrofit retrofit ;
    private static final String URL = "https://private-83598-estudiantes.apiary-mock.com/";

    public static Retrofit getConnection(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}

