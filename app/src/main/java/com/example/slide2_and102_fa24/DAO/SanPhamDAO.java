package com.example.slide2_and102_fa24.DAO;

import com.example.slide2_and102_fa24.models.SanPham;

import java.util.ArrayList;

public class SanPhamDAO {

    public ArrayList<SanPham> getDS() {
        ArrayList<SanPham> list = new ArrayList<>();
        list.add(new SanPham(1, "Áo", 100000));
        list.add(new SanPham(2, "Quần", 200000));
        list.add(new SanPham(3, "Giày", 300000));

        return list;
    }
}
