/* package com.example.aplikasi4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaptergrid extends RecyclerView.Adapter<adaptergrid.myViewHolder> {

    ArrayList<modelmenu> menuArrayList;
    Context context;

    public adaptergrid(ArrayList<modelmenu> menuArrayList, Context context) {
        this.menuArrayList = menuArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public adaptergrid.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.format_tampilan_grid, parent, false);
        return new adaptergrid.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptermenu.myViewHolder holder, int position) {
        holder.cnamamenu.setText(menuArrayList.get(position).namaMenu);
        holder.chargamenu.setText(menuArrayList.get(position).hargaMenu);
        holder.csatuanmenu.setText(menuArrayList.get(position).satuanMenu);
        holder.myimage.setImageResource(menuArrayList.get(position).gambarMenu);

    }

    @Override
    public int getItemCount() {
        return menuArrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView myimage;
        TextView cnamamenu, chargamenu, csatuanmenu;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            cnamamenu = itemView.findViewById(R.id.namamenu);
            chargamenu = itemView.findViewById(R.id.hargamenu);
            csatuanmenu = itemView.findViewById(R.id.satuanmenu);
            myimage = itemView.findViewById(R.id.gambarmenu);
        }
    }
} */