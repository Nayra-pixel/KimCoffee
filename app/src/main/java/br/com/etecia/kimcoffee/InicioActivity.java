package br.com.etecia.kimcoffee;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class InicioActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_layout);

        bottomNav = findViewById(R.id.idBottomNavMenu);

        loadFragment(new CoffeeFragment());

        bottomNav.setOnItemSelectedListener(item -> {
            loadFragment(createFragment(item.getItemId()));
            return true;
        });
    }
    private Fragment createFragment(int idPosition) {
        switch (idPosition) {
            case 0:
                return new CoffeeFragment();

            case 1:
                return new MuffinFragment();

            case 2:
                return new TeaFragment();

            case 3:
                return new DonutsFragment();

            default:
                return new CoffeeFragment();
        }
    }
    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.idFrameContainer, fragment)
                .commit();
    }
}
