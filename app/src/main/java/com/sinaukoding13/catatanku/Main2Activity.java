package com.sinaukoding13.catatanku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textisi;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textisi = findViewById(R.id.textisi);
        back = findViewById(R.id.back);

//        Bundle bundle = getIntent().getExtras();
//        final String judul_isi = bundle.getString("key");

        back.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent go = new Intent(Main2Activity.this,MainActivity.class);
                            startActivity(go);
                        }
                    });


    }
}
