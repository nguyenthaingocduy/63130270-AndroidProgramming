package didi63cntt.ungdungsuckhoe.Adapter;

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

import didi63cntt.ungdungsuckhoe.Domain.Category_Domain;
import didi63cntt.ungdungsuckhoe.R;

public class CategoryAdapters extends RecyclerView.Adapter<CategoryAdapters.viewholder> {
    ArrayList<Category_Domain> items;
    Context context;
    public CategoryAdapters(ArrayList<Category_Domain> items) {
        this.items = items;
    }


    @NonNull
    @Override
    public CategoryAdapters.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category, parent, false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapters.viewholder holder, int position) {
        holder.titleTxt.setText(items.get(position).getTitle());
        int drawableResourceId = holder.itemView.getResources()
                .getIdentifier(items.get(position).getImgPath(),"drawable", holder.itemView.getContext().getPackageName());

        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView titleTxt;
        ImageView pic;
        public viewholder(@NonNull View itemView){
            super(itemView);
            titleTxt=itemView.findViewById(R.id.titleTxt);
            pic = itemView.findViewById(R.id.img);
        }
    }
}
