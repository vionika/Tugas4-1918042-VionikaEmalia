package com.example.tugaspertemuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NovelAdapter adapter;
    private ArrayList<Novel> NovelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new NovelAdapter(NovelArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        NovelArrayList = new ArrayList<>();
        NovelArrayList.add(new Novel(" Touch Touch You "," Romantis "," ♡7,7JT",R.drawable.a));
        NovelArrayList.add(new Novel(" LOOKISM "," Aksi "," ♡33,7JT ",R.drawable.b));
        NovelArrayList.add(new Novel(" Bite Me "," Romantis "," ♡1,1JT",R.drawable.c));
        NovelArrayList.add(new Novel(" iMarried "," Romantis "," ♡11JT",R.drawable.d));
        NovelArrayList.add(new Novel(" High School Soldier "," Aksi "," ♡3JT",R.drawable.e));
        NovelArrayList.add(new Novel(" Me And My Professor "," Romantis "," ♡2,4JT",R.drawable.f));
        NovelArrayList.add(new Novel(" The Real Lesson "," Aksi "," ♡3,7JT",R.drawable.g));
        NovelArrayList.add(new Novel(" Kiss Sixth Sense "," Romantis "," ♡899.500",R.drawable.h));
        NovelArrayList.add(new Novel(" Leveling Up My Husband To The Max "," Kerajaan "," ♡490.265",R.drawable.i));
        NovelArrayList.add(new Novel(" White Blood "," Fantasi "," ♡4,7JT",R.drawable.j));
    }
}