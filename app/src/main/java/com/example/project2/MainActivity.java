package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
 //   Button btn1;
    ImageButton imagebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      //  Button btn1=findViewById(R.id.btn1);
        ImageButton imagebtn=findViewById(R.id.imagebtn);
     //   RecyclerView recyclerView=findViewById(R.id.recycleviewscheme);

        imagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RecycleviewActivity.class);
                startActivity(intent);
            }
        });


    }
}