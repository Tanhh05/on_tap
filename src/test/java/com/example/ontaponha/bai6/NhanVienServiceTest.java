package com.example.ontaponha.bai6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NhanVienServiceTest {
    NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
    }

    @Test
    void test() {
        NhanVien nhanVien = new NhanVien("NV001","Phan Tuan Anh",50f,"12-12-2005");
        Assertions.assertTrue(nhanVienService.add(nhanVien));
        Assertions.assertTrue(nhanVienService.delete("NV001"));
    }
}
