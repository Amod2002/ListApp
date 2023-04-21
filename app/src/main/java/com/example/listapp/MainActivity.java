package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            listView = findViewById(R.id.listView);


        List<String> Name = new ArrayList<>();
        List<Integer> Image = new ArrayList<>();
        List<String> price = new ArrayList<>();
        List <String> rating = new ArrayList<>();

        Name.add("French Fries");
        Name.add("Grilled Sandwich");
        Name.add("Veg Burger");
        Name.add("Hot & Sour Soup");
        Name.add("Spring Roll");
        Name.add("Veg Hakka Noodles");
        Name.add("Veg Fried Rice");
        Name.add("Pav Bhaji");
        Name.add("Sambhar Vada");
        Name.add("Manchurian Gravy");



        Image.add(R.drawable.french);
        Image.add(R.drawable.grilledsandwich);
        Image.add(R.drawable.vegburger);
        Image.add(R.drawable.hotandsour);
        Image.add(R.drawable.springroll);
        Image.add(R.drawable.veghakkanoodles);
        Image.add(R.drawable.friedrice);
        Image.add(R.drawable.pavbhaji);
        Image.add(R.drawable.vadasambar);
        Image.add(R.drawable.manchurain);


        price.add("Rs 106");
        price.add("Rs 135");
        price.add("Rs 72");
        price.add("Rs 190");
        price.add("RS 109");
        price.add("Rs 145");
        price.add("Rs 175");
        price.add("Rs 145");
        price.add("Rs 180");
        price.add("Rs 165");

        rating.add("4.5");
        rating.add("4.1");
        rating.add("4.3");
        rating.add("4.8");
        rating.add("3.9");
        rating.add("3.7");
        rating.add("4.4");
        rating.add("4.5");
        rating.add("4.2");
        rating.add("4.6");

        MyAdapter myAdapter = new MyAdapter(this, Name,Image,price,rating);
        listView.setAdapter(myAdapter);

    }
}