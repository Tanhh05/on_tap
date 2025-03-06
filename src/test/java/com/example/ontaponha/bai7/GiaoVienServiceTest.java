package com.example.ontaponha.bai7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GiaoVienServiceTest {
    GiaoVienService giaoVienService;

    @BeforeEach
    void setUp() {
        giaoVienService = new GiaoVienService();
    }

    @Test
    void themGiaoVien() {
        GiaoVien giaoVien = new GiaoVien("GV001", "Thao", 50f, "02-02-2025");
        Assertions.assertTrue(giaoVienService.add(giaoVien));
    }
}
