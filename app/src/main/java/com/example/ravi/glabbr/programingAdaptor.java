package com.example.ravi.glabbr;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class programingAdaptor extends RecyclerView.Adapter<programingAdaptor.programmingViewHolder> {


    private String[] data;
    private int[] imageUrl;
    public programingAdaptor(String[] name,int[] imageUrl){                        // data will be show in recyclerview
           this.data=name;
        this.imageUrl = imageUrl;
                                                                                    //constructor
    }


    @NonNull
    @Override
    public programmingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {      //Holding View

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);
        return new programmingViewHolder(view);                                     //storing views
    }

    @Override
    public void onBindViewHolder(@NonNull programmingViewHolder holder, int position) {   //databinding


        String title =data[position];
        int img=imageUrl[position];
        holder.textTitle.setText(title);
        holder.imageIcon.setImageResource(img);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class  programmingViewHolder extends RecyclerView.ViewHolder{


        ImageView imageIcon;
        TextView textTitle;

        public programmingViewHolder(View itemView) {
            super(itemView);

            imageIcon=(ImageView) itemView.findViewById(R.id.imageItem);
            textTitle=(TextView) itemView.findViewById(R.id.textTitle);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Position: " + Integer.toString(getAdapterPosition()), Toast.LENGTH_LONG).show();
                }
            });


        }
    }

}
