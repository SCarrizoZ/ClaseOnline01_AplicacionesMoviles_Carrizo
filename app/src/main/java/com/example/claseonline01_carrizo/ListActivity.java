package com.example.claseonline01_carrizo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView listaProductos;

    String[] productos = {
            "Joyas artesanales", "Ropa vintage", "Arte local",
            "Productos de belleza naturales", "Libros usados", "Instrumentos musicales",
            "Plantas de interior", "Artesanías de cerámica", "Juguetes retro", "Antigüedades",
            "Ropa étnica", "Artículos de decoración hechos a mano", "Bisutería", "Productos de cuero",
            "Artesanías de madera"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listaProductos = findViewById(R.id.LISTVIEW_LIST_PRODUCTOS);

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                productos
        );

        listaProductos.setAdapter(adapter);

    }
}