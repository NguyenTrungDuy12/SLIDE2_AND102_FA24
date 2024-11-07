package com.example.slide2_and102_fa24;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.slide2_and102_fa24.DAO.SanPhamDAO;
import com.example.slide2_and102_fa24.adapter.SanPhamAdapter;
import com.example.slide2_and102_fa24.models.SanPham;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvDS;

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

        rcvDS = findViewById(R.id.rcvDS);

        SanPhamDAO sanPhamDAO = new SanPhamDAO();
        ArrayList<SanPham> list = sanPhamDAO.getDS();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvDS.setLayoutManager(linearLayoutManager);
        SanPhamAdapter sanPhamAdapter = new SanPhamAdapter(this, list);
        rcvDS.setAdapter(sanPhamAdapter);

    }
}