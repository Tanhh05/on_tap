package com.example.ontaponha.bai6;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    List<NhanVien> list = new ArrayList<>();

    public boolean add(NhanVien nv){
        if (nv == null || nv.getMaNv().trim().isEmpty() ||
        nv.getTenNv().trim().isEmpty() ||
        nv.getLuong() < 0 || nv.getLuong() > 65 ||
        nv.getNgaySinh().isEmpty()){
            return false;
        }
        list.add(nv);
        return true;
    }

    public boolean delete(String ma){
        return list.removeIf(nhanVien -> nhanVien.getMaNv().equals(ma));
    }

    public boolean update(NhanVien nv, String maMoi, String tenMoi, Float luongMoi, String ngayMoi){
        if (nv == null || nv.getMaNv().trim().isEmpty() ||
                nv.getTenNv().trim().isEmpty() ||
                nv.getLuong() < 0 || nv.getLuong() > 65 ||
                nv.getNgaySinh().isEmpty()){
            return false;
        }
        nv.setMaNv(maMoi);
        nv.setTenNv(tenMoi);
        nv.setLuong(luongMoi);
        nv.setNgaySinh(ngayMoi);
        return true;
    }
}
