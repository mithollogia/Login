package com.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView b1,b2,b3,b4;
    TextView logo, slogan, registrar, membro;
    Button logar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.bg1);
        b2 = findViewById(R.id.bg2);
        b3 = findViewById(R.id.bg3);
        b4 = findViewById(R.id.bg4);

        b4.setTranslationY(-1920);
        b3.setTranslationY(-1920);
        b2.setTranslationY(-1920);
        b1.setTranslationY(-1920);

        b4.animate().translationY(0).setDuration(800).setStartDelay(460).start();
        b3.animate().translationY(0).setDuration(800).setStartDelay(450).start();
        b2.animate().translationY(0).setDuration(800).setStartDelay(300).start();
        b1.animate().translationY(0).setDuration(800).setStartDelay(10).start();

        logo   = findViewById(R.id.logo);
        slogan = findViewById(R.id.slogan);
        logar  = findViewById(R.id.logar);
        membro  = findViewById(R.id.membro);
        registrar  = findViewById(R.id.registrar);

        logo.setAlpha(0);
        slogan.setAlpha(0);
        logar.setAlpha(0);
        membro.setAlpha(0);
        registrar.setAlpha(0);

        logo.animate().alpha(1).setDuration(800).setStartDelay(800).start();
        slogan.animate().alpha(1).setDuration(800).setStartDelay(850).start();
        logar.animate().alpha(1).setDuration(800).setStartDelay(900).start();
        membro.animate().alpha(1).setDuration(800).setStartDelay(950).start();
        registrar.animate().alpha(1).setDuration(800).setStartDelay(1000).start();

        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
    }
}
