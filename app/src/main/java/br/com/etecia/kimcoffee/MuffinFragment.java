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

public class MuffinFragment extends Fragment {

    RecyclerView idRecyclerViewMuffin;
    List<Muffin> lstMuffin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_muffin, container, false);

        lstMuffin = new ArrayList<>();
        idRecyclerViewMuffin = view.findViewById(R.id.idRecyclerViewMuffin);
        lstMuffin.add(new Muffin(R.drawable.muffinum, "Muffin de Chocolate","Macio, úmido e cheio de pedaços de chocolate ao leite derretido."));
        lstMuffin.add(new Muffin(R.drawable.muffindois, "Muffin de Blueberry", "Recheado com blueberries frescas que explodem ao morder."));
        lstMuffin.add(new Muffin(R.drawable.muffintres, "Muffin de Banana", "Feito com banana madura, aroma adocicado e textura fofinha."));
        lstMuffin.add(new Muffin(R.drawable.muffinquatro, "Muffin de Maçã e Canela", "Perfeito para manhãs aconchegantes, com toque aromático de canela."));
        lstMuffin.add(new Muffin(R.drawable.muffincinco, "Muffin de Baunilha", "Clássico e simples, sabor delicado com essência natural de baunilha."));
        lstMuffin.add(new Muffin(R.drawable.muffinseis, "Muffin Integral", "Feito com farinha integral e açúcar mascavo, opção mais leve e nutritiva."));

        AdaptadorMuffin adapteracess = new AdaptadorMuffin(getContext(), lstMuffin);

        idRecyclerViewMuffin.setLayoutManager(new GridLayoutManager(getContext(),2));

        idRecyclerViewMuffin.setAdapter(adapteracess);

        return view;
    }
}
