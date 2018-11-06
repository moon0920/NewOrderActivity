package com.mmj.www.neworderactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mainBtnOrder = findViewById(R.id.mainBtnOrder);
        mainBtnOrder.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mainBtnOrder:
                Bundle bundle = new Bundle();
                Intent intent = new Intent(this, OrderActivity.class);
                intent.putExtras(bundle);
                startActivityForResult(intent, 100);
                break;


        }
    }
}
