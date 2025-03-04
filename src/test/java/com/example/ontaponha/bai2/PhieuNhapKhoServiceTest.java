package com.example.ontaponha.bai2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PhieuNhapKhoServiceTest {
    private PhieuNhapKhoServie phieuNhapKhoServie;

    @BeforeEach
    void setUp(){
        phieuNhapKhoServie = new PhieuNhapKhoServie();
    }

    @Test
    public void ThemPhieuNhapKho(){
        PhieuNhapKho phieuNhapKho = new PhieuNhapKho("PNK001", "NC001",32.5f,"30-5-2025");
        Assertions.assertTrue(phieuNhapKhoServie.add(phieuNhapKho));
    }

    @Test
    public void XoaPhieuNhapKho(){
        PhieuNhapKho phieuNhapKho = new PhieuNhapKho("PNK001", "NC001",32.5f,"30-5-2025");
        Assertions.assertTrue(phieuNhapKhoServie.add(phieuNhapKho));
        Assertions.assertTrue(phieuNhapKhoServie.xoa("PNK001"));
    }

    @Test
    void testSuaPhieuNhapKhoThanhCong() {
        PhieuNhapKho phieuNhapKho = new PhieuNhapKho("PNK001", "NC001", 32.5f, "30-5-2025");
        Assertions.assertTrue(phieuNhapKhoServie.add(phieuNhapKho));
        Assertions.assertTrue(phieuNhapKhoServie.suaPhieuNhapKho(phieuNhapKho, "PNK001", "NC001", 32.5f, "30-5-2025"));
    }

}
