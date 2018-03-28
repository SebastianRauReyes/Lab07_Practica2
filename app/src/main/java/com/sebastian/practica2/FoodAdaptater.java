package com.sebastian.practica2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Alumno on 27/03/2018.
 */

public class FoodAdaptater extends RecyclerView.Adapter<FoodAdaptater.ViewHolder> {


    private List<Food> foods;


    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView pictureImage;
        TextView nameText;
        TextView timeText;
        TextView priceText;


        public ViewHolder(View itemView) {
            super(itemView);
            pictureImage = itemView.findViewById(R.id.picture_image);
            nameText = itemView.findViewById(R.id.name_text);
            timeText = itemView.findViewById(R.id.time_text);
            priceText = itemView.findViewById(R.id.price_text);

        }
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.iten_food, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;



    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final Food food = foods.get(position);

        int resId = holder.itemView.getContext().getResources().getIdentifier(food.getPicture(), "drawable", holder.itemView.getContext().getPackageName());

        holder.pictureImage.setImageResource(resId);

        holder.nameText.setText(food.getName());
        holder.timeText.setText(food.getTime());
        holder.priceText.setText(food.getPrice());

        //Accion
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(holder.itemView.getContext(), "Detalles de Persona: " + food.getName(), Toast.LENGTH_SHORT).show();
                // Llamar a otra pantalla y mostrar sus detalles de esta persona ...


            }
        });



    }

    @Override
    public int getItemCount() {
        return foods.size();
    }


}
