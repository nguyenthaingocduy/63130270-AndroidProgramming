package ntu63130270.cau3_gioithieubanthan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }



    public void button_tiktok (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tiktok.com/@gonudy"));
        startActivity(intent);
    }

    public void button_fa (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100009048886566"));
        startActivity(intent);
    }

    public void button_github (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nguyenthaingocduy/63130270-AndroidProgramming"));
        startActivity(intent);
    }
}