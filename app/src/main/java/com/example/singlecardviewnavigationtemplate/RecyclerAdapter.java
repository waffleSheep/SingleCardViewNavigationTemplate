package com.example.singlecardviewnavigationtemplate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private Context context;
    private CompleteViewModel completeViewModel;

    private String[] titles ={"Title 0",
            "Title 1",
            "Title 2",
            "Title 3",
            "Title 4",
            "Title 5"};

    private String[] details = {"Description 0",
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",
            "Description 5"};

    public RecyclerAdapter(Context context){
        this.context = context;
        this.completeViewModel = new ViewModelProvider((FragmentActivity) context).get(CompleteViewModel.class);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemTitle.setText(titles[position]);
        holder.itemDetails.setText(details[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView itemTitle;
        TextView itemDetails;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemDetails = itemView.findViewById(R.id.item_detail);
            context = itemView.getContext();
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    NavController navController = Navigation.findNavController(itemView);
                    int position = getAdapterPosition();
                    completeViewModel.adapterPosition.setValue(position);
                    navController.navigate(R.id.action_cardViewFragment_to_selectedFragment);
                }
            });

        }
    }
}
