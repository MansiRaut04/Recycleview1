package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecycleviewActivity extends AppCompatActivity {


    public RecyclerView recyclerView;
    public RecyclerView.Adapter mAdapter;
    public RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);

        //recyclerView=findViewById(R.id.recyclerView);
        RecyclerView recyclerView=findViewById(R.id.recycleview1);


        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter

        List<String>myDataset=new ArrayList<>();
        myDataset.add("1.Brisa Munda krushi Yojana(BMKY)");
        myDataset.add("2.District Cess Fund Scheme (DCFS)va");
        myDataset.add("3.Dr Babasaheb Krishi Swawalamban Yojana(DBKY)");
        myDataset.add("4.Falbag Lagwad Yojana(FLY)");
        myDataset.add("5.Farm Pond Programme As Per Demand(FPP)");
        myDataset.add("6.Grant for tractor(GFT)");
        myDataset.add("7.Micro-Irrigation(MI)");
        myDataset.add("8.Farm Pond Programme As PerDemand(NADEP_CS)");
        myDataset.add("9.Pradhan mantri kisan mandhan Yojana (PMKSY)");
        myDataset.add("10.Pradhan mantri peek veema Yojana(PMPVY)");
        myDataset.add("11.Vermicompost Scheme(VS)");
        
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }
}