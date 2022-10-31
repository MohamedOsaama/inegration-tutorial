package org.etisalat.myEtisalat.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.Console;

public class searchTest {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
    @Test
    public void test() {
        driver.get("https://www.etisalat.ae/b2c/ecareLogin.html");
        String title = driver.getTitle();
        System.out.println("Application Navigated page /n " + title);


    }
}
