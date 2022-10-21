package com.example.aplikasi4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<modelmenu> menuArrayList = new ArrayList<>();
    RecyclerView recyclerView;
    int gambar_menu[] = {R.drawable.menu1, R.drawable.menu2, R.drawable.menu3,
                         R.drawable.menu4, R.drawable.menu5, R.drawable.menu6,
                         R.drawable.menu7, R.drawable.menu8, R.drawable.menu9,};
    String nama_menu[] = {"Nasi Goreng", "Soto Sapi", "Ayam Goreng", "Nasi Kuning", "Nasi Rames",
                            "Nasi Gudeg", "Soto Ayam", "Bubur Ayam", "Bakso Sapi"};
    String harga_menu[] = {"14000", "12000", "22000", "9000", "10000", "10000", "15000", "16000",
                            "15000"};
    String satuan_menu[] = {"Piring", "Mangkok", "Ekor", "Pincuk", "Piring", "Pincuk", "Mangkok",
                            "Mangkok", "Mangkok"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclermenu);
        baca_dataMenu();
        tampil_listview();
        tampil_gridview();

        /* adaptermenu adaptermenu = new adaptermenu(menuArrayList, this);
        recyclerView.setAdapter(adaptermenu);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this)); */
    }

    private void baca_dataMenu() {
        for(int i = 0; i < nama_menu.length; i++) {
            menuArrayList.add(new modelmenu(nama_menu[i], harga_menu[i], satuan_menu[i], gambar_menu[i]));

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuku,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.item1){
            // Toast.makeText(this, "Anda Memilih Listview", Toast.LENGTH_SHORT).show();
            tampil_listview();
            adaptermenu adaptermenu = new adaptermenu(menuArrayList, this);
            recyclerView.setAdapter(adaptermenu);
            recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        }else{
            // Toast.makeText(this, "Anda Memilih Gridview", Toast.LENGTH_SHORT).show();
            tampil_gridview();

        }
        return super.onOptionsItemSelected(item);
    }

    private void tampil_gridview() {
        adaptermenu adaptermenu = new adaptermenu(menuArrayList, this);
        recyclerView.setAdapter(adaptermenu);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
    }

    private void tampil_listview() {
        adaptermenu adaptermenu = new adaptermenu(menuArrayList, this);
        recyclerView.setAdapter(adaptermenu);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}