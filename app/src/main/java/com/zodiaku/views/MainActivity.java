package com.zodiaku.views;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zodiaku.R;
import com.zodiaku.adapters.ZodiakItemAdapter;

public class MainActivity extends AppCompatActivity implements ZodiakItemAdapter.ZodiakListener {
//    @BindView(R.id.listZodiak) RecyclerView listZodiak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupList();
    }

    private void setupList(){
        ZodiakItemAdapter zia = new ZodiakItemAdapter(this, this);
        RecyclerView listZodiak = (RecyclerView)findViewById(R.id.listZodiak);
        listZodiak.setLayoutManager(new LinearLayoutManager(this));
        listZodiak.setHasFixedSize(true);
        listZodiak.setAdapter(zia);
    }

    @Override
    public void onItemClick(int pos) {
        DetailZodiakFragment dzf = DetailZodiakFragment.newInstance(pos);
        dzf.show(getSupportFragmentManager(), "content");
//        dzf.showProgress(this);
    }
}
