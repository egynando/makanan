package com.example.aplikasi4;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaptermenu extends RecyclerView.Adapter<adaptermenu.myViewHolder> {

    ArrayList<modelmenu> menuArrayList;
    Context context;

    public adaptermenu(ArrayList<modelmenu> menuArrayList, Context context) {
        this.menuArrayList = menuArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.format_tampilan, parent, false);
        return new adaptermenu.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.cnamamenu.setText(menuArrayList.get(position).namaMenu);
        holder.chargamenu.setText(menuArrayList.get(position).hargaMenu);
        holder.csatuanmenu.setText(menuArrayList.get(position).satuanMenu);
        holder.myimage.setImageResource(menuArrayList.get(position).gambarMenu);
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Anda pilih "+menuArrayList.get(position).namaMenu, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return menuArrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView myimage;
        TextView cnamamenu, chargamenu, csatuanmenu;
        CardView cv;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            cnamamenu = itemView.findViewById(R.id.namamenu);
            chargamenu = itemView.findViewById(R.id.hargamenu);
            csatuanmenu = itemView.findViewById(R.id.satuanmenu);
            myimage = itemView.findViewById(R.id.gambarmenu);
            cv = itemView.findViewById(R.id.cardpilih);
        }
    }
}
