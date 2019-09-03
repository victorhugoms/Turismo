package com.example.turismo.adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.turismo.R;
import com.example.turismo.modelos.Pontos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

public class Adapter extends ArrayAdapter<Pontos> {

    private Context context;
    private List<Pontos> pontos;

    public Adapter(Context context, ArrayList<Pontos> list) {
        super(context, 0, list);
        this.context = context;
        pontos = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(context)
                    .inflate(R.layout.pontos_turistico, parent, false);
        }

        Pontos pontoAtual = pontos.get(position);
        TextView nome = listItem.findViewById(R.id.text_view_nome);
        nome.setText((pontoAtual.getNome()));

        TextView distancia = listItem.findViewById(R.id.text_view_distancia);
        distancia.setText(pontoAtual.getDistancia());

        ImageView img = listItem.findViewById(R.id.image_view_img);
        img.setImageResource(pontoAtual.getImagen());


        return listItem;

    }
}