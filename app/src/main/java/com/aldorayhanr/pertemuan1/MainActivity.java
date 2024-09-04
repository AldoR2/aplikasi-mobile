package com.aldorayhanr.pertemuan1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtGender, edtTelp;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtTampil = (TextView) findViewById(R.id.txtTampil);
        edtNpm  = (EditText) findViewById(R.id.edtNpm);git
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtGender = (EditText) findViewById(R.id.edtGender);
        edtTelp   = (EditText) findViewById(R.id.edtTlp);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strGender = edtGender.getText().toString();
                String StrTelp = edtTelp.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strGender + "\n" + StrTelp);
            }
        });
    }
}