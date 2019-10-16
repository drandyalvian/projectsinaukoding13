package com.sinaukoding13.catatanku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class AddNoteAct extends AppCompatActivity {

    Button tambah, back;
    TextView tgl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        back = findViewById(R.id.back);
        tambah = findViewById(R.id.tambah);

        tgl = findViewById(R.id.tgl);

        long date = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        String dateString = sdf.format(date);
        tgl.setText(dateString);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(AddNoteAct.this,MainActivity.class);
                startActivity(go);
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(AddNoteAct.this,MainActivity.class);
                startActivity(go);
            }
        });
    }
}
