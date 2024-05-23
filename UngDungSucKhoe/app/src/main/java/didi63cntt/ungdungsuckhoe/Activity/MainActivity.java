package didi63cntt.ungdungsuckhoe.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import didi63cntt.ungdungsuckhoe.Domain.Category_Domain;
import didi63cntt.ungdungsuckhoe.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter catAdapter, bestDealAdapter;
    private RecyclerView recyclerViewCat, recyclerViewBestDeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);


        initRecyclerViewCat();











        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    private void initRecyclerViewCat(){
        ArrayList<Category_Domain> items = new ArrayList<>();
        items.add(new Category_Domain("cat1", "Vegetable"));
        items.add(new Category_Domain("cat2", "Fruits"));
        items.add(new Category_Domain("cat3", "Dairy"));
        items.add(new Category_Domain("cat4", "Drinks"));
        items.add(new Category_Domain("cat5", "Grain"));
    }

}