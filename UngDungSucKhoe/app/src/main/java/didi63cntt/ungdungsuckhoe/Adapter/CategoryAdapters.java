package didi63cntt.ungdungsuckhoe.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import didi63cntt.ungdungsuckhoe.R;

public class CategoryAdapters extends RecyclerView.Adapter<CategoryAdapters.viewholder> {

    @NonNull
    @Override
    public CategoryAdapters.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapters.viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
