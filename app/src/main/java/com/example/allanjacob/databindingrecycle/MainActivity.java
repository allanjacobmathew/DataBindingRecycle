package com.example.allanjacob.databindingrecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<DataClass> dataList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DataAdaptor mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recycle_id);

        mAdapter = new DataAdaptor(dataList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        dummydata();
    }
    private void dummydata(){
        DataClass dataClass=new DataClass("ALLAN","8089195505");
        dataList.add(dataClass);
         dataClass=new DataClass("abu","8089195504");
        dataList.add(dataClass);
         dataClass=new DataClass("abc","8089195505");
        dataList.add(dataClass);
        dataClass=new DataClass("efg","8089195510");
        dataList.add(dataClass);
    }
}
