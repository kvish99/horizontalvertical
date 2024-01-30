package com.example.horizontalvertical;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.horizontalvertical.Adapter.HorizontalAdapter;
import com.example.horizontalvertical.Adapter.HorizontalAdapter;
import com.example.horizontalvertical.Adapter.VerticalAdapter;
import com.example.horizontalvertical.Model.FoodMenu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView verticalRecyclerView, horizontalRecyclerView;
    List<FoodMenu> foodMenuList;

    VerticalAdapter verticalAdapter;

    HorizontalAdapter horizontalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verticalRecyclerView = findViewById(R.id.verticalrecyclerview);
        horizontalRecyclerView = findViewById(R.id.horizontalrecyclerview);

        foodMenuList = new ArrayList<>();

        FoodMenu food1 = new FoodMenu("Chicken Mandi", R.drawable.mandi);
        FoodMenu food2 = new FoodMenu("Mutton Mandi", R.drawable.mutton);
        FoodMenu food3 = new FoodMenu("Fish Biryani", R.drawable.fish);
        FoodMenu food4 = new FoodMenu("Chicken Biryani", R.drawable.biryani);
        FoodMenu food5 = new FoodMenu("Prawns Biryani", R.drawable.prawns);
        FoodMenu food6 = new FoodMenu("Chicken Soup", R.drawable.soup);
        FoodMenu food7 = new FoodMenu("Chicken Mandi", R.drawable.mandi);
        FoodMenu food8 = new FoodMenu("Chicken Biryani", R.drawable.biryani);
        FoodMenu food9 = new FoodMenu("Chicken Soup", R.drawable.soup);
        FoodMenu food10 = new FoodMenu("Chicken Soup", R.drawable.soup);

        foodMenuList.add(food1);
        foodMenuList.add(food2);
        foodMenuList.add(food3);
        foodMenuList.add(food4);
        foodMenuList.add(food5);
        foodMenuList.add(food6);
        foodMenuList.add(food7);
        foodMenuList.add(food8);
        foodMenuList.add(food9);
        foodMenuList.add(food10);


        horizontalAdapter = new HorizontalAdapter(foodMenuList);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        horizontalRecyclerView.setLayoutManager(horizontalLayoutManager);
        horizontalRecyclerView.setAdapter(horizontalAdapter);

        verticalAdapter = new VerticalAdapter(foodMenuList);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        verticalRecyclerView.setAdapter(verticalAdapter);


    }
}