package com.example.horizontalvertical.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.horizontalvertical.Model.FoodMenu;
import com.example.horizontalvertical.R;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.FoodViewHolder> {

    List<FoodMenu> foodMenuList;

    public HorizontalAdapter(List<FoodMenu> foodMenuList) {
        this.foodMenuList = foodMenuList;
    }


    @NonNull
    @Override
    public HorizontalAdapter.FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.mylistitem,parent,false);
        return new FoodViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalAdapter.FoodViewHolder holder, int position) {

        FoodMenu foodMenu = foodMenuList.get(position);
        holder.textView.setText(foodMenu.getFoodname());
        holder.imageView.setImageResource(foodMenu.getFoodimage());

    }

    @Override
    public int getItemCount() {
        return foodMenuList.size();
    }
    public static class FoodViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.foodname);
            imageView=itemView.findViewById(R.id.foodimage);

        }
    }
}
