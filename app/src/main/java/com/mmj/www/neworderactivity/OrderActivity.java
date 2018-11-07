package com.mmj.www.neworderactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {

    int cnt=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Button buttonResult = findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(this);
        Button buttonCancel = findViewById(R.id.buttonCancel);
        buttonCancel.setOnClickListener(this);

        ImageButton imageButtonAdd1=findViewById(R.id.imageButtonAdd1);
        imageButtonAdd1.setOnClickListener(this);
        ImageButton imageButtonminer1=findViewById(R.id.imageButtonminer1);
        imageButtonminer1.setOnClickListener(this);

        TextView textViewNum1=findViewById(R.id.textViewNum1);
        Integer i = Integer.valueOf();

        /*ImageButton imageButtonAdd2=findViewById(R.id.imageButtonAdd2);
        imageButtonAdd2.setOnClickListener(this);
        ImageButton imageButtonAdd3=findViewById(R.id.imageButtonAdd3);
        imageButtonAdd3.setOnClickListener(this);*/
    }





    @Override
    public void onClick(View view) {
//        Bundle bundle =new Bundle();
//        // bundle.putString("sun",text);
//        Intent intent = new Intent(this,MainActivity.class);
//        intent.putExtras(bundle);
//        startActivityForResult(intent, 100);




        int cnt=0;
        switch (view.getId()){

            case R.id.imageButtonAdd1:
                cnt++;
                textViewNum1 = textViewNum1.setText(String.valueOf(cnt)
                break;

            case R.id.imageButtonminer1:
                cnt--;
                break;


            case R.id.buttonResult:
                break;



        }

    }
}
