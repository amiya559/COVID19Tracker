package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActicity extends AppCompatActivity {

    private int positioncountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_acticity);

        Intent intent = getIntent();
        positioncountry = intent.getIntExtra("position", 0);

        getSupportActionBar().setTitle("Details of "+AffectedCountries.countryModelList.get(positioncountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(AffectedCountries.countryModelList.get(positioncountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(positioncountry).getCases());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positioncountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(positioncountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(positioncountry).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(positioncountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelList.get(positioncountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(positioncountry).getTodayDeaths());


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
