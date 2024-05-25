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

import didi63cntt.ungdungsuckhoe.Adapter.BestDealAdapter;
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
        initRecyclerViewBestDeal();



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

    private void initRecyclerViewBestDeal(){
        recyclerViewBestDeal = findViewById(R.id.bestView);
        recyclerViewBestDeal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        bestDealAdapter= new BestDealAdapter(getData());
        recyclerViewBestDeal.setAdapter(bestDealAdapter);
    }
    public ArrayList<ItemsDomain> getData() {
        ArrayList<ItemsDomain> items = new ArrayList<>();
        items.add(new ItemsDomain("orange","Fresh Orange" ,6.2,"With it vibrant orange hue and a burst of refreshing" + "citrus flavor, the juicy orange is a natural source of" +"vitamin C, invigorating your senses and" +" supporting your immune system. A delightful snack" +" that combines health and tatse.",4.2));
        items.add(new ItemsDomain("apple", "Fresh Apple",6.5,"Apples, originating in Central Asia, come in many varieties from sweet to sour. High in carbs and rich in vitamin C, they’re versatile, commonly eaten as snacks or used in desserts.",4.8));
        items.add(new ItemsDomain("watermelon","Fresh Watermelon",5.1,"Originating in Southern Africa, watermelons thrive in tropical regions and are 91.5% water. They vary in size, with the largest recorded at 159 kg from Tennessee. Sweet and juicy, they offer various nutrients per cup (154g).",4.9));
        items.add(new ItemsDomain("berry","Fresh BlackBerry",6,"Blackberries, small berries with a big taste, grow on brambles. They’re commonly cultivated but also found wild, which have more polyphenols. Low in fructose, they pair well with cream. Rich in vitamin C, blackberries offer significant health benefits.",4.5));
        items.add(new ItemsDomain("pineaplle","Fresh Pineaplle",10,"Originating from South America, pineapples are now common in tropical regions like the Philippines and the Caribbean. With firm yellow flesh and a sweet, juicy taste, they are used in juices, smoothies, desserts, and pizzas.",3));
        items.add(new ItemsDomain("strawberry","Fresh Strawberry",12,"Strawberries, a beloved fruit, are technically accessory fruits. Eaten fresh or in desserts, they taste and smell sweet. Their flavor and scent are common in candy, soaps, creams, and lip balms.",4));
        return items;
    }

}