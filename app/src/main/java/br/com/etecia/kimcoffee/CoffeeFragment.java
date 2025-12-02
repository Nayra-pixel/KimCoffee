package br.com.etecia.kimcoffee;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.etecia.kimcoffee.R;

public class CoffeeFragment extends Fragment {

    RecyclerView idRecyclerViewCoffee;
    List<Coffee> lstCoffee;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_coffee, container, false);

        lstCoffee = new ArrayList<>();
        idRecyclerViewCoffee = view.findViewById(R.id.idRecyclerViewCoffee);
        lstCoffee.add(new Coffee(R.drawable.coffeeum,"Expresso","Intenso e aromático, preparado com grãos selecionados para um sabor encorpado."));
        lstCoffee.add(new Coffee(R.drawable.coffeedois,"Cappuccino","Combinação perfeita de café, leite e espuma cremosa, com toque suave e aconchegante."));
        lstCoffee.add(new Coffee(R.drawable.coffeetres,"Latte Macchiato","Leite vaporizado aveludado com uma delicada dose de espresso, sabor leve e equilibrado."));
        lstCoffee.add(new Coffee(R.drawable.coffeequatro,"Mocha Chocolate","Mistura de café e chocolate com leite cremoso, resultando em uma bebida doce e marcante."));
        lstCoffee.add(new Coffee(R.drawable.coffeecinco,"Café com Leite","Clássico e simples: meio a meio de café e leite quente para um gosto suave e familiar."));
        lstCoffee.add(new Coffee(R.drawable.coffeeseis,"Café Avelã Cremoso","Café quente levemente adocicado com toque de avelã, aroma envolvente e sabor suave e aconchegante."));
        AdaptadorCoffee adapteracess = new AdaptadorCoffee(getContext(), lstCoffee);

        idRecyclerViewCoffee.setLayoutManager(new GridLayoutManager(getContext(),2));

        idRecyclerViewCoffee.setAdapter(adapteracess);


        return view;
    }
}