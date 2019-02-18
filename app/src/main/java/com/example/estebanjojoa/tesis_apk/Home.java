package com.example.estebanjojoa.tesis_apk;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.estebanjojoa.tesis_apk.View.factores;
import com.example.estebanjojoa.tesis_apk.View.graficas;
import com.example.estebanjojoa.tesis_apk.View.inicio;
import com.example.estebanjojoa.tesis_apk.View.medicamentos;
import com.example.estebanjojoa.tesis_apk.View.mediciones;

public class Home extends AppCompatActivity {

    BottomNavigationView btn_navigation;
   


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_navigation = (BottomNavigationView) findViewById(R.id.botton_navigation);
        btn_navigation.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new inicio()).commit();

    }


   private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
               switch (item.getItemId()){
                       case R.id.Item_home:
                           selectedFragment = new inicio();
                           break;

                        case R.id.Item_medicion:
                            selectedFragment = new mediciones();
                            break;

                        case R.id.Item_graficas:
                            selectedFragment = new graficas();
                            break;

                        case R.id.Item_medicamentos:
                            selectedFragment = new medicamentos();
                             break;

                        case R.id.Item_control:
                            selectedFragment = new factores();
                            break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, selectedFragment).commit();
                return true;
            }

        };
}
