package br.com.etecia.kimcoffe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.etecia.kimcoffee.Coffee;
import br.com.etecia.kimcoffee.R;

public class AdaptadorCoffee extends RecyclerView.Adapter<AdaptadorCoffee.ViewHolder> {
    private Context context;
    private List<Coffee> lstCoffee;

    public AdaptadorCoffee(Context context, List<Coffee> lstCoffee) {
        this.context = context;
        this.lstCoffee = lstCoffee;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);

        view = inflater.inflate(R.layout.modelo_coffee, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idNomeCoffee.setText(lstCoffee.get(position).getIdNomeCoffee());
        holder.imgCardCoffee.setImageResource(lstCoffee.get(position).getImgCardCoffee());
    }

    @Override
    public int getItemCount() {
        return lstCoffee.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgCardCoffee;

        TextView idNomeCoffee;

        TextView descCardCoffee;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCardCoffee = itemView.findViewById(R.id.imgCardCoffee);
            idNomeCoffee = itemView.findViewById(R.id.idNomeCoffee);
            descCardCoffee = itemView.findViewById(R.id.descCardCoffee);

        }
    }
}