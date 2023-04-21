package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends ArrayAdapter {

    List<String>foodName;
    List<Integer>foodImage;
    List<String>foodPrice;
    List<String> foodRating;

    Context context;
    public MyAdapter(@NonNull Context context,List<String> name, List<Integer> image, List<String>price, List<String>rating) {
        super(context, R.layout.items, name);

        this.foodName = name;
        this.foodImage = image;
        this.foodPrice = price;
        this.foodRating = rating;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.items, parent, false);

        ImageView foodimageView = view.findViewById(R.id.food_item_image);
        TextView foodtextViewName = view.findViewById(R.id.food_item_name);
        TextView foodtextViewPrice = view.findViewById(R.id.food_item_price);
        TextView foodtextViewRating = view.findViewById(R.id.food_item_rating);
        Button addtoCartBtn = view.findViewById(R.id.addtocardbtn);
        CardView cardView = view.findViewById(R.id.cardView);





        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "CardView is Clicked" , Toast.LENGTH_SHORT).show();
            }
        });



        addtoCartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Item is Add to Cart" , Toast.LENGTH_SHORT).show();
            }
        });

        foodimageView.setImageResource(foodImage.get(position));
        foodtextViewName.setText(foodName.get(position));
        foodtextViewPrice.setText(foodPrice.get(position));
        foodtextViewRating.setText(foodRating.get(position));


        return view ;

    }
}
