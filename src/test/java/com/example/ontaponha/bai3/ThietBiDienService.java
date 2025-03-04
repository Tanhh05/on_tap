package com.example.ontaponha.bai3;

import java.util.ArrayList;
import java.util.List;

public class ThietBiDienService {
    List<ThietBiDien> list = new ArrayList<>();

    public boolean add(ThietBiDien tbd){
        if (tbd == null || tbd.getMaTBD().trim().isEmpty() ||
        tbd.getMaNCC().trim().isEmpty() ||
        tbd.getTongTien() < 0 || tbd.getTongTien() > 100 ||
        tbd.getNgayNhap().isEmpty()){
            return false;
        }
        list.add(tbd);
        return true;
    }

    public boolean xoa(String ma){
        return list.removeIf(thietBiDien -> thietBiDien.getMaTBD().equals(ma));
    }

    public boolean sua(ThietBiDien tbd, String MaTbdMoi, String MaNccMoi, Float tongTienMoi, String ngayNhapMoi){
        if (tbd == null || tbd.getMaTBD().trim().isEmpty() ||
        tbd.getMaNCC().trim().isEmpty() ||
        tbd.getTongTien() < 0 || tbd.getTongTien() > 100 ||
        tbd.getNgayNhap().isEmpty()){
            return false;
        }
        tbd.setMaTBD(MaTbdMoi);
        tbd.setMaNCC(MaNccMoi);
        tbd.setTongTien(tongTienMoi);
        tbd.setNgayNhap(ngayNhapMoi);
        return true;
    }

}
