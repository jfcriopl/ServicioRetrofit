package com.uco.myapplication.Interfaces;
import java.util.List;

import com.uco.myapplication.Entidad.Estudiante;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("estudiantes")
    public abstract Call<List<Estudiante>> listaEstudiantes();


}
