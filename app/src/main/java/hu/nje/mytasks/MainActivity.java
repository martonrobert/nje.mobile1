package hu.gamf.njezh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    RecyclerView recyclerView;



    String s1[], s2[];
    int images[] = {R.drawable.fradi, R.drawable.dioos, R.drawable.fehervar, R.drawable.deb, R.drawable.kecskemet, R.drawable.kisvarda, R.drawable.mezokovesd, R.drawable.mtk, R.drawable.paks, R.drawable.puskas, R.drawable.ujpest, R.drawable.zalaegerszeg };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.teams);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images, fragmentManager) {

        };
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}