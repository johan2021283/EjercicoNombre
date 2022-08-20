package com.example.muestrenombre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText c1, c2;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.CajaTexto);
        c2=findViewById(R.id.CajaTamaño);
        t1=findViewById(R.id.VerTexto);
    }
    public void Incrementa(View view)
    {
        String cad1=c1.getText().toString();
        int tamaño=Integer.parseInt(c2.getText().toString());
        t1.setText(cad1+"");
        t1.setTextSize(tamaño);



    }
}