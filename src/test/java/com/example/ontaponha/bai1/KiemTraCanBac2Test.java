package com.example.ontaponha.bai1;

import org.junit.jupiter.api.Test;

public class KiemTraCanBac2Test {
    @Test
    public void testCanBac2() {
        //khoi tao doi tuong KiemTraCanBac2
        KiemTraCanBac2 kiemTraCanBac2 = new KiemTraCanBac2();
        //goi phuong thuc canBac2 voi tham so la 4
        double result = kiemTraCanBac2.canBac2(4);
        //kiem tra ket qua tra ve co dung voi gia tri mong muon hay khong
        if (result == 2) {
            System.out.println("Test canBac2(4) passed");
        } else {
            System.out.println("Test canBac2(4) failed");
        }
    }

    //kiem tra canBac2 voi so am
    @Test
    public void testCanBac2SoAm() {
        //khoi tao doi tuong KiemTraCanBac2
        KiemTraCanBac2 kiemTraCanBac2 = new KiemTraCanBac2();
        //goi phuong thuc canBac2 voi tham so la -4
        double result = kiemTraCanBac2.canBac2(-4);
        //kiem tra ket qua tra ve co dung voi gia tri mong muon hay khong
        if (result == Double.NaN) {
            System.out.println("Test canBac2(-4) passed");
        } else {
            System.out.println("Test canBac2(-4) failed");
        }
    }
}
