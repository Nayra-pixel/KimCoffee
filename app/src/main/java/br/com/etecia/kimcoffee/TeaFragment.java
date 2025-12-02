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

public class TeaFragment extends Fragment {

    RecyclerView idRecyclerViewTea;
    List<Tea> lstTea;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tea, container, false);

        lstTea = new ArrayList<>();
        idRecyclerViewTea = view.findViewById(R.id.idRecyclerViewTea);

        lstTea.add(new Tea(R.drawable.teaum, "Chá Verde", "Refrescante, antioxidante e levemente herbal."));
        lstTea.add(new Tea(R.drawable.teadois, "Chá de Camomila", "Calmante, delicado e perfeito para relaxar."));
        lstTea.add(new Tea(R.drawable.teatres, "Chá de Hortelã", "Aromático, mentolado e muito refrescante."));
        lstTea.add(new Tea(R.drawable.teaquatro, "Chá Preto", "Intenso, tradicional e com sabor encorpado."));
        lstTea.add(new Tea(R.drawable.teacinco, "Chá Mate", "Clássico e levemente amargo com notas terrosas."));
        lstTea.add(new Tea(R.drawable.teaseis, "Chá Frutado", "Mistura doce e aromática de frutas vermelhas."));

        AdaptadorTea adapter = new AdaptadorTea(getContext(), lstTea);

        idRecyclerViewTea.setLayoutManager(new GridLayoutManager(getContext(), 2));
        idRecyclerViewTea.setAdapter(adapter);

        return view;
    }
}
