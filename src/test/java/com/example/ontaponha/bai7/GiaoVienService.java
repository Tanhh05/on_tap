package com.example.ontaponha.bai7;

import java.util.ArrayList;
import java.util.List;

public class GiaoVienService {
    List<GiaoVien> list = new ArrayList<>();

    public boolean add(GiaoVien gv) {
        if (gv == null || gv.getMaGv().trim().isEmpty() ||
                gv.getTenGv().trim().isEmpty() ||
                gv.luong < 0 || gv.getLuong() > 100 ||
                gv.getNgaySinh().isEmpty()) {
            return false;
        }
        list.add(gv);
        return true;
    }

    public boolean delete(String ma) {
        return list.removeIf(giaoVien -> giaoVien.getMaGv().equals(ma));
    }

    public GiaoVien search(String ma){
        return list.stream().filter(giaoVien -> giaoVien.equals(ma)).findFirst().orElse(null);
    }

    public boolean update(GiaoVien gv, String maMoi, String tenMoi, Float luongMoi, String ngayMoi){
        if (gv == null || gv.getMaGv().trim().isEmpty() ||
                gv.getTenGv().trim().isEmpty() ||
                gv.luong < 0 || gv.getLuong() > 100 ||
                gv.getNgaySinh().isEmpty()) {
            return false;
        }
        gv.setMaGv(maMoi);
        gv.setTenGv(tenMoi);
        gv.setLuong(luongMoi);
        gv.setNgaySinh(ngayMoi);
        return true;
    }
}
