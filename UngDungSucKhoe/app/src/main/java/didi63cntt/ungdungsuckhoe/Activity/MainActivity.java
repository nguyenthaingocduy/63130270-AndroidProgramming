package didi63cntt.ungdungsuckhoe.Activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import didi63cntt.ungdungsuckhoe.Adapter.CategoryAdapters;
import didi63cntt.ungdungsuckhoe.Domain.Category_Domain;
import didi63cntt.ungdungsuckhoe.Domain.ItemsDomain;
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
        initLocation();




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void initLocation(){
        String[] items = new String[]{"LosAngles, USA", "NewYork, USA"};
        final Spinner locationSpin = findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        locationSpin.setAdapter(adapter);
    }
    private void initRecyclerViewCat(){
        ArrayList<Category_Domain> items = new ArrayList<>();
        items.add(new Category_Domain("cat1", "Vegetable"));
        items.add(new Category_Domain("cat2", "Fruits"));
        items.add(new Category_Domain("cat3", "Dairy"));
        items.add(new Category_Domain("cat4", "Drinks"));
        items.add(new Category_Domain("cat5", "Grain"));

        recyclerViewCat = findViewById(R.id.catView);
        recyclerViewCat.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        catAdapter = new CategoryAdapters(items);
        recyclerViewCat.setAdapter(catAdapter);

    }

    public ArrayList<ItemsDomain> getData() {
        ArrayList<ItemsDomain> items = new ArrayList<>();
        items.add(new ItemsDomain("orange","Fresh Orange" ,6.2,"With it vibrant orange hue and a burst of refreshing" + "citrus flavor, the juicy orange is a natural source of" +"vitamin C, invigorating your senses and" +" supporting your immune system. A delightful snack" +" that combines health and tatse.",4.2));
        items.add(new ItemsDomain("apple", "Fresh Apple",6.5,"Apples, originating in Central Asia, come in many varieties from sweet to sour. High in carbs and rich in vitamin C, they’re versatile, commonly eaten as snacks or used in desserts.",4.8));
        items.add(new ItemsDomain("watermelon", , , , , , ));
        items.add(new ItemsDomain("berry", , , , , , ));
        items.add(new ItemsDomain("pineapple", , , , , , ));
        items.add(new ItemsDomain("strawberry", , , , , , ));
        return items;
    }

}