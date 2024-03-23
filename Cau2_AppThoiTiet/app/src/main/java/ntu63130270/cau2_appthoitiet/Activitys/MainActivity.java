package ntu63130270.cau2_appthoitiet.Activitys;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ntu63130270.cau2_appthoitiet.Adapters.HourlyAdapters;
import ntu63130270.cau2_appthoitiet.Domains.Hourly;
import ntu63130270.cau2_appthoitiet.R;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterHourly;
private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initRecyclerview();





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void initRecyclerview() {
        ArrayList<Hourly> items = new ArrayList<>();

        items.add(new Hourly("7 pm", 28, "cloudy"));
        items.add(new Hourly("7 am", 30, "sunny"));
        items.add(new Hourly("12 pm", 30, "wind"));
        items.add(new Hourly("1 am", 29, "rainy"));
        items.add(new Hourly("2 am", 27, "storm"));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterHourly = new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHourly);

    }
}