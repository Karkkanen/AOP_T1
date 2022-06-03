package com.UEF.TaskOne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView tervehdysTeksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tervehdysTeksi = findViewById(R.id.tvTervehdys);
    }
    public void vaihdaTeksti(View view){

        tervehdysTeksi.setText("Hei Maailma!");

    }
}

