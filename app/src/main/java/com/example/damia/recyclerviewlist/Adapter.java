package com.example.damia.recyclerviewlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    Context mContext;
    List<Item> mData;

    public Adapter(Context mContext, List<Item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v  =inflater.inflate(R.layout.card_item, parent, false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.profile_photo.setImageResource(mData.get(position).getProfilePhoto());
        holder.tv_title.setText(mData.get(position).getProfileName());
        holder.tv_nmFollowers.setText(mData.get(position).getNbFollowers() + "Followers");

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

class ViewHolder extends RecyclerView.ViewHolder{

    ImageView profile_photo, background_img;
    TextView tv_title, tv_nmFollowers;


    public ViewHolder(View itemView) {
        super(itemView);
        profile_photo = itemView.findViewById(R.id.profile_img);
        background_img = itemView.findViewById(R.id.card_background);
        tv_title = itemView.findViewById(R.id.card_title);
        tv_nmFollowers = itemView.findViewById(R.id.card_nb_followers);
    }
}
