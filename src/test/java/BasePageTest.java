package org.example.tests;

import org.example.pages.FindProduct;
import org.example.pages.LoginPage;
import org.example.pages.ProductDetail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasePageTest {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    private LoginPage loginPage;
    private FindProduct findProduct;  // Fixed variable naming
private ProductDetail productdeatils;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();  // Initialize WebDriver
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.bewakoof.com/");
        driver.manage().window().maximize();

        // Initialize Page Objects AFTER driver is set up
        loginPage = new LoginPage(driver, wait);
        findProduct = new FindProduct(driver);
        productdeatils = new ProductDetail(driver);
    }

    @Test(priority = 0)
    void testLoginButton() {
        loginPage.clickLoginButton();
        loginPage.Otp();

        // Assertion: Check if the current URL contains "login"
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"), "Login page did not open properly!");
    }

    @Test(priority = 1)
    void testProductPage() {
        // Renamed method to follow Java conventions
        try {
            Thread.sleep(5000L);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        findProduct.findPro("tshirt");


        // Assertion: Ensure search results are displayed (Example)

    }

    @Test(priority = 2)
    void addtocart(){
         productdeatils.addProduct();
         productdeatils.scroll();
         productdeatils.selectingAddress();
    }


    @AfterTest
    void cleanup() {
        System.out.println("Test execution completed.");

    }
}
