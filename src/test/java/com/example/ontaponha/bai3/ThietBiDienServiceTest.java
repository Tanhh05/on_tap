package com.example.ontaponha.bai3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThietBiDienServiceTest {
    private ThietBiDienService thietBiDienService;

    @BeforeEach
    void setUp() {
        thietBiDienService = new ThietBiDienService();
    }

    @Test
    void ThemThietBiDien() {
        ThietBiDien thietBiDien = new ThietBiDien("TBD001", "NC001",30.0f,"20-10-2025");
        Assertions.assertTrue(thietBiDienService.add(thietBiDien));
    }
}
