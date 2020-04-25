package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.leo.simplearcloader.SimpleArcLoader;

import org.eazegraph.lib.charts.PieChart;

public class MainActivity extends AppCompatActivity {

    // Connecting XML file with its corresponding JAVA file by initializing the object
    TextView tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths,tvAffectedCountries;
    SimpleArcLoader simpleArcLoader;
    ScrollView scrollView;
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvTotalDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);
        tvAffectedCountries = findViewById(R.id.tvAffectedCountries);

        simpleArcLoader = findViewById(R.id.loader);
        scrollView = findViewById(R.id.scrollStats);
        pieChart = findViewById(R.id.piechart);

        fetchdata();
    }

    private void fetchdata() {

        String url = "https://corona.lmao.ninja/v2/all";

        simpleArcLoader.start();

        //StringRequest request = new StringRequest(Request.Method.GET, url, )

    }

    public void goTrackCountries(View view) {

    }
}
