package com.example.ontaponha.bai2;

import java.util.ArrayList;
import java.util.List;

public class PhieuNhapKhoServie {
    List<PhieuNhapKho> list = new ArrayList<>();

    public boolean add(PhieuNhapKho phieuNhapKho) {
        if (phieuNhapKho == null || phieuNhapKho.getMaPNK().trim().isEmpty() ||
        phieuNhapKho.getMaNCC().trim().isBlank() || phieuNhapKho.getTongTien() == null ||
        phieuNhapKho.getNgayNhap().isEmpty()){
            return false;
        }
        list.add(phieuNhapKho);
        return true;
    }

    public boolean xoa(String ma) {
        return list.removeIf(phieuNhapKho -> phieuNhapKho.getMaPNK().equals(ma));
    }

    public PhieuNhapKho getOne(String ma){
        return list.stream().filter(phieuNhapKho -> phieuNhapKho.equals(ma)).findFirst().orElse(null);
    }

    public boolean suaPhieuNhapKho(PhieuNhapKho phieuNhapKho, String maPhieuMoi, String maNccMoi, Float tongTienMoi, String ngayMoi) {
        if (phieuNhapKho == null || phieuNhapKho.getMaPNK().trim().isEmpty() ||
                phieuNhapKho.getMaNCC().trim().isEmpty() || phieuNhapKho.getTongTien() == null ||
                phieuNhapKho.getNgayNhap().trim().isEmpty()) {
            return false;
        }
        phieuNhapKho.setMaPNK(maPhieuMoi);
        phieuNhapKho.setMaNCC(maNccMoi);
        phieuNhapKho.setTongTien(tongTienMoi);
        phieuNhapKho.setNgayNhap(ngayMoi);

        return true;
    }

}
