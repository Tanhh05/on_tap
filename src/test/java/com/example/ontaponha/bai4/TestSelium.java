package com.example.ontaponha.bai4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelium {
    ChromeDriver chromeDriver;
    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    void test() {
        chromeDriver.get("https://lamia.com.vn/san-pham/dam-chu-a-tay-coc-co-yem-ld416");
        WebElement btnThemGioHang = chromeDriver.findElement(By.xpath("(//button[contains(text(),'Thêm vào giỏ')])[1]"));
        btnThemGioHang.click();
    }
}
