package br.com.etecia.kimcoffee;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class DonutsFragment extends Fragment {

    RecyclerView idRecyclerViewDonuts;
    List<Donuts> lstDonuts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_donuts, container, false);

        lstDonuts = new ArrayList<>();
        idRecyclerViewDonuts = view.findViewById(R.id.idRecyclerViewDonuts);

        lstDonuts.add(new Donuts(R.drawable.donutum, "Donut Chocolate", "Coberto com chocolate ao leite macio e brilho suave."));
        lstDonuts.add(new Donuts(R.drawable.donutdois, "Donut Morango", "Cobertura rosa com sabor natural de morango, fofinho e doce."));
        lstDonuts.add(new Donuts(R.drawable.donuttres, "Donut Glaceado", "Clássico com cobertura açucarada e massa leve."));
        lstDonuts.add(new Donuts(R.drawable.donutquatro, "Donut Doce de Leite", "Recheado com doce de leite cremoso e cobertura suave."));
        lstDonuts.add(new Donuts(R.drawable.donutcinco, "Donut Caramelo", "Cobertura caramelizada com toque amanteigado."));
        lstDonuts.add(new Donuts(R.drawable.donutseis, "Donut Nutella", "Generosamente recheado com Nutella — explosão de sabor."));

        AdaptadorDonuts adapter = new AdaptadorDonuts(getContext(), lstDonuts);

        idRecyclerViewDonuts.setLayoutManager(new GridLayoutManager(getContext(), 2));
        idRecyclerViewDonuts.setAdapter(adapter);

        return view;
    }
}
