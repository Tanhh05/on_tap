package com.example.ontaponha.bai5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinhVienServiceTest {
    SinhVienService sinhVienService;

    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
    }

    @Test
    void themSinhVien() {
        SinhVien sinhVien = new SinhVien("SV001", "Tuan Anh",65,"SD19308");
        Assertions.assertTrue(sinhVienService.addSinhVien(sinhVien));
    }
}
