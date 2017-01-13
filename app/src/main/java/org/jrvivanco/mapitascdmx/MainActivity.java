package org.jrvivanco.mapitascdmx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapas(View view)
    {
        Intent i = new Intent(this, MapsActivity.class);

        switch (view.getId())
        {
            case R.id.ivPlaza:
                i.putExtra("Lugar", "Plaza de la República");
                i.putExtra("Latitud", 19.4361506);
                i.putExtra("Longitud", -99.1543096);
                i.putExtra("Puntero", R.drawable.binoculars);
                break;

            case R.id.ivEstadio:
                i.putExtra("Lugar", "Estadio Azteca");
                i.putExtra("Latitud", 19.3028657);
                i.putExtra("Longitud", -99.1505277);
                i.putExtra("Puntero", R.drawable.soccer);
                break;

            case R.id.ivAngel:
                i.putExtra("Lugar", "Ángel de la Independencia");
                i.putExtra("Latitud", 19.4270243);
                i.putExtra("Longitud", -99.167665);
                i.putExtra("Puntero", R.drawable.airballoon);
                break;

            case R.id.ivPalacio:
                i.putExtra("Lugar", "Palacio de Bellas Artes");
                i.putExtra("Latitud", 19.4344153);
                i.putExtra("Longitud", -99.1412003);
                i.putExtra("Puntero", R.drawable.music_note);
                break;
        }
        startActivity(i);

    }
}
