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

public class AdaptadorMuffin extends RecyclerView.Adapter<AdaptadorMuffin.ViewHolder> {
    private Context context;
    private List<Muffin> lstMuffin;

    public AdaptadorMuffin(Context context, List<Muffin> lstMuffin) {
        this.context = context;
        this.lstMuffin = lstMuffin;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);

        view = inflater.inflate(R.layout.modelo_muffin, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idNomeMuffin.setText(lstMuffin.get(position).getIdNomeMuffin());
        holder.imgCardMuffin.setImageResource(lstMuffin.get(position).getImgCardMuffin());
        holder.descCardMuffin.setText(lstMuffin.get(position).getDescCardMuffin());
    }

    @Override
    public int getItemCount() {
        return lstMuffin.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgCardMuffin;
        TextView idNomeMuffin;
        TextView descCardMuffin;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCardMuffin = itemView.findViewById(R.id.imgCardMuffin);
            idNomeMuffin = itemView.findViewById(R.id.idNomeMuffin);
            descCardMuffin = itemView.findViewById(R.id.descCardMuffin);
        }
    }
}
