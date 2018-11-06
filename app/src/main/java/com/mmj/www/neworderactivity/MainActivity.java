package com.mmj.www.neworderactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mainBtnOrder = findViewById(R.id.mainBtnOrder);
        mainBtnOrder.setOnClickListener(this);

        String[] MENU = new String[] {"아메리카노", "카페라떼", "에그토스트", "햄토스트","샌드위치","스콘"};
        ListView listView = (ListView)findViewById(R.id.listViewtable);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.listview,MENU);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

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

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        String text = ((TextView)view).getText().toString();
        Bundle bundle = new Bundle();
        bundle.getString(text);
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent,200);
    }
}
