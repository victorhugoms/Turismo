package com.example.turismo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.turismo.adpater.Adapter;
import com.example.turismo.modelos.Pontos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Pontos> pontos = new ArrayList<>();
    private ArrayAdapter<Pontos> arrayAdapterPonto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criarTarefa();


        listView = findViewById(R.id.list_view_principal);

        arrayAdapterPonto = new Adapter(MainActivity.this,
                (ArrayList<Pontos>) pontos);
        listView.setAdapter(arrayAdapterPonto);


    }



    public  void criarTarefa(){
        this.pontos.add(new Pontos("Catedral","850m", R.drawable.catedral));
        this.pontos.add(new Pontos("Broa","17,6km", R.drawable.broa));
        this.pontos.add(new Pontos("Fazenda do Pinhal",
                "23,8km", R.drawable.fazenda));
        this.pontos.add(new Pontos("Parque Ecológico",
                "5,5km", R.drawable.parque_eco));
    }
}

