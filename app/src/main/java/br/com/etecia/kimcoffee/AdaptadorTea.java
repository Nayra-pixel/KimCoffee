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

public class AdaptadorTea extends RecyclerView.Adapter<AdaptadorTea.ViewHolder> {

    private Context context;
    private List<Tea> lstTea;

    public AdaptadorTea(Context context, List<Tea> lstTea) {
        this.context = context;
        this.lstTea = lstTea;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.modelo_tea, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Tea t = lstTea.get(position);

        holder.idNomeTea.setText(t.getIdNomeTea());
        holder.imgCardTea.setImageResource(t.getImgCardTea());
        holder.descCardTea.setText(t.getDescCardTea());
    }

    @Override
    public int getItemCount() {
        return lstTea.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgCardTea;
        TextView idNomeTea;
        TextView descCardTea;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCardTea = itemView.findViewById(R.id.imgCardTea);
            idNomeTea = itemView.findViewById(R.id.idNomeTea);
            descCardTea = itemView.findViewById(R.id.descCardTea);
        }
    }
}
