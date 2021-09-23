package com.uco.myapplication;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import com.uco.myapplication.Interfaces.Service;
import com.uco.myapplication.Entidad.Estudiante;
import com.uco.myapplication.ConexionRest.Conexion;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> datos = new ArrayList<String>();
    ListView listViewUsuario;
    ArrayAdapter<String> adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewUsuario = findViewById(R.id.idListUsuarios);
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        listViewUsuario.setAdapter(adaptador);

        cargaData();

    }

    public void cargaData(){
        Service api = Conexion.getConnection().create(Service.class);
        Call<List<Estudiante>> call = api.listaEstudiantes();
        call.enqueue(new Callback<List<Estudiante>>() {
            @Override
            public void onResponse(Call<List<Estudiante>> call, Response<List<Estudiante>> response) {
                muestraMensaje("Consulta exitosa");
                if(response.isSuccessful()){
                    List<Estudiante> respuesta = response.body();

                    for(Estudiante estudiante: respuesta){
                        datos.add(estudiante.getNumeroDocumento() + " " +  estudiante.getNombres() + " " +  estudiante.getApellidos());
                    }
                    adaptador.notifyDataSetChanged();

                }else{
                    muestraMensaje("La respuesta es incorrecta");
                }
            }

            @Override
            public void onFailure(Call<List<Estudiante>> call, Throwable t) {
                muestraMensaje("--> Error:" + t.getMessage());

            }
        });

    }

    public void muestraMensaje(String msg){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(msg);
        alert.show();

    }
}