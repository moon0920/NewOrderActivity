package com.mmj.www.neworderactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Button buttonResult = findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(this);
        Button buttonCancel = findViewById(R.id.buttonCancel);
        buttonCancel.setOnClickListener(this);
        //
    }

    @Override
    public void onClick(View view) {
        Bundle bundle =new Bundle();
        // bundle.putString("sun",text);
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 100);

    }
}
