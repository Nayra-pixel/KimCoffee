package br.com.etecia.kimcoffee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorDonuts extends RecyclerView.Adapter<AdaptadorDonuts.ViewHolder> {

    private Context context;
    private List<Donuts> lstDonuts;

    public AdaptadorDonuts(Context context, List<Donuts> lstDonuts) {
        this.context = context;
        this.lstDonuts = lstDonuts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.modelo_donuts, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Donuts d = lstDonuts.get(position);

        holder.idNomeDonuts.setText(d.getIdNomeDonuts());
        holder.imgCardDonuts.setImageResource(d.getImgCardDonuts());
        holder.descCardDonuts.setText(d.getDescCardDonuts());
    }

    @Override
    public int getItemCount() {
        return lstDonuts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgCardDonuts;
        TextView idNomeDonuts;
        TextView descCardDonuts;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCardDonuts = itemView.findViewById(R.id.imgCardDonuts);
            idNomeDonuts = itemView.findViewById(R.id.idNomeDonuts);
            descCardDonuts = itemView.findViewById(R.id.descCardDonuts);
        }
    }
}
