package cntt63.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter  extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHoder> {

    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem =  cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHoder viewhoderCreated = new ItemLandHoder(vItem);
        return viewhoderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHoder holder, int position) {

        //lay doi tuong hien thi
        LandScape landScapeHienThi = lstData.get(position);
        //trich thong tin
        String caption = landScapeHienThi.getLandCaption();
        String tenFileAnh = landScapeHienThi.getLandName();
        // Dat vao cac truong thong tin cua holder
        holder.textViewCaption.setText(caption);
        //dat anh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipma", packageName);
        holder.imageViewLandScape.setImageResource(imageID);

    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class  ItemLandHoder extends RecyclerView.ViewHolder{
        TextView textViewCaption;
        ImageView imageViewLandScape;

        public ItemLandHoder(@NonNull View itemView) {
            super(itemView);
            textViewCaption = itemView.findViewById(R.id.textViewCaption);
            imageViewLandScape = itemView.findViewById(R.id.imageViewLand);

        }
    }

}
