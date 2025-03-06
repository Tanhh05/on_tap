package com.example.ontaponha.bai5;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> list = new ArrayList<>();

    public boolean addSinhVien(SinhVien sv){
        if (sv == null || sv.getMaSv().trim().isEmpty() ||
        sv.getTenSv().trim().isEmpty() ||
        sv.getTuoi() < 0 || sv.getTuoi() > 65 ||
        sv.getLop().trim().isEmpty()){
            return false;
        }
        list.add(sv);
        return true;
    }

    public boolean xoaSv(String ma){
        return list.removeIf(sinhVien -> sinhVien.getMaSv().equals(ma));
    }

    public boolean suaSv(SinhVien sv, String maMoi, String tenMoi, Integer tuoiMoi, String lopMoi){
        if (sv == null || sv.getMaSv().trim().isEmpty() ||
                sv.getTenSv().trim().isEmpty() ||
                sv.getTuoi() < 0 || sv.getTuoi() > 65 ||
                sv.getLop().trim().isEmpty()){
            return false;
        }
        sv.setMaSv(maMoi);
        sv.setTenSv(tenMoi);
        sv.setTuoi(tuoiMoi);
        sv.setLop(lopMoi);
        return true;
    }
}
