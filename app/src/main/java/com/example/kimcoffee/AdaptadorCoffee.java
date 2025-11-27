package com.example.kimcoffee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorCoffee extends RecyclerView.Adapter<AdaptadorCoffee.ViewHolder> {

    private Context context;
    private List<Coffee> lstCoffee;

    public AdaptadorCoffee(Context context, List<Coffee> lstCoffee) {
        this.context = context;
        this.lstCoffee = lstCoffee;
    }

    @NonNull
    @Override
    public AdaptadorCoffee.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);

        view = inflater.inflate(R.layout.card_modelo_coffee, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorCoffee.ViewHolder holder, int position) {
        holder.idTituloCardCoffee.setText(lstCoffee.get(position).getIdTituloCoffee());
        holder.imgCardCoffee.setImageResource(lstCoffee.get(position).getImgCardCoffee());
        holder.descCardCoffee.setText(lstCoffee.get(position).getDescCardCoffee());

    }

    @Override
    public int getItemCount() {
        return lstCoffee.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgCardCoffee;
        TextView idTituloCardCoffee;
        TextView descCardCoffee;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCardCoffee = itemView.findViewById(R.id.imgCardCoffee);
            idTituloCardCoffee = itemView.findViewById(R.id.idTituloCoffee);
            descCardCoffee = itemView.findViewById(R.id.descCardCoffee);

        }
    }
}