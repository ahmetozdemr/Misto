package com.ahmox.misto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayi1;
    TextView sonuc;
    Button hesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1 =(EditText)findViewById(R.id.et_birinciSayi);
        sonuc=(TextView) findViewById(R.id.tv_sonuc);
        hesapla=(Button)findViewById(R.id.btn_topla);

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sayibir=Double.parseDouble(sayi1.getText().toString());

                double x = 1;

                x = (sayibir*25)/27;

                sonuc.setText(String.valueOf(x));


            }
        });

    }
}