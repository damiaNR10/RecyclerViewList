package com.example.damia.recyclerviewlist;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<Item> mList = new ArrayList<>();

        mList.add(new Item(R.drawable.background_photo1, "Cities", R.drawable.profile_picture1, 2500));
        mList.add(new Item(R.drawable.background_photo2, "Mountains", R.drawable.profile_picture2, 3100));
        mList.add(new Item(R.drawable.background_photo3, "Foods", R.drawable.profile_picture3, 8000));
        Adapter adapter = new Adapter(this, mList);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
