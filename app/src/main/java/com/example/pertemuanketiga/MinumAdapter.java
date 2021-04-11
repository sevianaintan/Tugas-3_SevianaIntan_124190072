package com.example.pertemuanketiga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MinumAdapter extends RecyclerView.Adapter<MinumAdapter.viewHolder> {


    private Context context;
    private ArrayList<MinumModel> minumModels;

    public MinumAdapter(Context context){ this.context = context; }
    public Context getContext() {return context; }
    public void setContext(Context context) {
        this.context = context;
    }
    public ArrayList<MinumModel> getMinumModels() {
        return minumModels;
    }

    public void setMinumModels(ArrayList<MinumModel> minumModels) {
        this.minumModels = minumModels;
    }

    @NonNull
    @Override
    public MinumAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup , int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_list, viewGroup ,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MinumAdapter.viewHolder holder, int i) {
        Glide.with(context).load(getMinumModels().get(i).getLogo()).into(holder.logo);
        holder.nama.setText(getMinumModels().get(i).getNamaMinum());
    }

    @Override
    public int getItemCount() {
        return getMinumModels().size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView logo;
        private TextView nama;
        public viewHolder(@NonNull View itemView){
            super(itemView);
            logo = itemView.findViewById(R.id.cdlogo);
            nama = itemView.findViewById(R.id.nama);
        }
    }
}
