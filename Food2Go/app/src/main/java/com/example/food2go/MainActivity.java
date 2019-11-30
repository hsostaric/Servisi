package com.example.food2go;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.core.Korisnik;
import com.example.food2go.DataLoaders.DataLoadedListener;
import com.example.food2go.DataLoaders.WsDataLoader;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity implements DataLoadedListener{

    private WsDataLoader wsDataLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.prijavaKlik)
    public void KlikPrijava(View v) {

        Korisnik korisnik = new Korisnik("igradiski","roleta66");
        wsDataLoader = new WsDataLoader();
        wsDataLoader.Prijava(korisnik,this);
    }


    @Override
    public void onDataLoaded(String message, String status, Object data) {
       if (status.equals("OK")){
           Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
       }else{
           Toast.makeText(getApplicationContext(),"Nije OK",Toast.LENGTH_SHORT).show();
       }
    }
}