package com.example.ontaponha.bai4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestSelium {
    ChromeDriver chromeDriver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    void test() {
        chromeDriver.get("https://vitimex.com.vn/dang-ky.html");
        WebElement inputHoTen = chromeDriver.findElement(By.xpath("(//input[@id='name'])[1]"));
        inputHoTen.sendKeys("phantuananh.hy@gmail.com");

        WebElement inputSdt = chromeDriver.findElement(By.xpath("(//input[@id='phone'])[1]"));
        inputSdt.sendKeys("0245147894");

        WebElement inputEmail = chromeDriver.findElement(By.xpath("(//input[@id='email'])[1]"));
        inputEmail.sendKeys("phantuananh.hy@gmail.com");

        WebElement inputMatKhau = chromeDriver.findElement(By.xpath("(//input[@id='pass-regis'])[1]"));
        inputMatKhau.sendKeys("123");

        WebElement inputMatKhauXacNhan = chromeDriver.findElement(By.xpath("(//input[@id='pass-confirm'])[1]"));
        inputMatKhauXacNhan.sendKeys("123");

        WebElement btnClick = chromeDriver.findElement(By.xpath("(//a[@id='register-btn'])[1]"));
        btnClick.click();
    }

    @Test
    public void testDangNhap() {
        chromeDriver.get("https://vitimex.com.vn/dang-ky.html");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));

        // Đợi và click vào nút "Đăng nhập ngay"
        WebElement btnDangNhapNgay = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Đăng nhập ngay')]")));
        btnDangNhapNgay.click();

        // Đợi đến khi input email hiển thị
        WebElement inputEmailDangNhap = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='account'])[1]")));
        inputEmailDangNhap.sendKeys("phantuananh.hy@gmail.com");

        // Đợi đến khi input mật khẩu hiển thị
        WebElement inputPass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='pass'])[1]")));
        inputPass.sendKeys("123");

        // Đợi và click vào nút đăng nhập
        WebElement btnDangNhapNe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@id='signin-btn'])[1]")));
        btnDangNhapNe.click();
    }
}
