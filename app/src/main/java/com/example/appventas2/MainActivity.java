package com.example.appventas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etIntent, etFullname,etEmail,etPassword;
    Button btnSave,btnSearch,btnupdate, btndelate;
    elsVenta dbSales =new clsVentas(this,"dbSales",null,1);
    TextView tvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etIntent = findViewById(R.id.etident);
        etFullname = findViewById(R.id.etfullname);
        etEmail = findViewById(R.id.etemail);
        etPassword = findViewById(R.id.etpassword);
        btnSave = findViewById(R.id.btnsave);
        btnupdate = findViewById(R.id.btnupdate);
        btnSearch = findViewById(R.id.btnsearch);
        btndelate = findViewById(R.id.btndelete);
        tvMessage = findViewById(R.id.tvMessage);

        btnSave.setOnClickListener(new View.OnClickListener(){
             @Override
             if(letIdent,getText(),teString(),isEmpty() && letFullname)

        }
    }
}