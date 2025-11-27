package com.example.kimcoffee;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CoffeeFragment extends Fragment {

    RecyclerView idRecyclerViewCoffee;
    List<Coffee> lstCoffee;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_coffee, container, false);

        idRecyclerViewCoffee = view.findViewById(R.id.idRecyclerViewCoffee);
        lstCoffee = new ArrayList<>();
        lstCoffee.add(new Coffee(R.drawable.coffeeum,"Cappuccino"));
        lstCoffee.add(new Coffee(R.drawable.coffeedois,"Mocaccino"));
        lstCoffee.add(new Coffee(R.drawable.coffeetres,"Mocha"));
        lstCoffee.add(new Coffee(R.drawable.coffeequatro,"Expresso"));
        lstCoffee.add(new Coffee(R.drawable.coffeecinco,"Chocolate Quente"));
        lstCoffee.add(new Coffee(R.drawable.coffeeseis,"Lungo"));

        AdaptadorCoffee adapteracess = new AdaptadorCoffee(getContext(), lstCoffee);

        idRecyclerViewCoffee.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        idRecyclerViewCoffee.setAdapter(adapteracess);


        return view;
    }
}