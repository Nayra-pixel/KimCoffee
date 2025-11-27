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
        lstCoffee.add(new Coffee(R.drawable.coffeeum,"Cappuccino", "Combinação perfeita de café, leite e espuma cremosa, com toque suave e aconchegante."));
        lstCoffee.add(new Coffee(R.drawable.coffeedois,"Latte Macchiato", "Leite vaporizado aveludado com uma delicada dose de espresso, sabor leve e equilibrado."));
        lstCoffee.add(new Coffee(R.drawable.coffeetres,"Mocha Chocolate", "Mistura de café e chocolate com leite cremoso, resultando em uma bebida doce e marcante."));
        lstCoffee.add(new Coffee(R.drawable.coffeequatro,"Expresso", "Intenso e aromático, preparado com grãos selecionados para um sabor encorpado."));
        lstCoffee.add(new Coffee(R.drawable.coffeecinco,"Café com Leite", "Clássico e simples: meio a meio de café e leite quente para um gosto suave e familiar."));
        lstCoffee.add(new Coffee(R.drawable.coffeeseis,"Café Gelado", "Refrescante e leve, preparado com café extraído a frio e servido com gelo."));

        AdaptadorCoffee adapteracess = new AdaptadorCoffee(getContext(), lstCoffee);

        idRecyclerViewCoffee.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        idRecyclerViewCoffee.setAdapter(adapteracess);


        return view;
    }
}