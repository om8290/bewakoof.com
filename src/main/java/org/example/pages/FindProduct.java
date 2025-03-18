package org.example.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class FindProduct {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public FindProduct(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locator for the search input field
    private By search = By.xpath("//input[@class='header_search_field_input__R0r_M']");
private   By Product= By.xpath("(//section[@class='sc-89d6e897-4 FQouP'])[2]");

    // Method to search for a product
    public void findPro(String item){
        // Wait for the search input field to be clickable
        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(search));


        searchField.sendKeys("shirt");
        searchField.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Product01= wait.until((ExpectedConditions.visibilityOfElementLocated(Product)));
         Product01.click();
        TakesScreenshot s = (TakesScreenshot) driver;
//            File src = ss.getScreenshotAs(OutputType.FILE);
//
//            // Define the destination file with name and extension
//            File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\screenshot.png");
//
//            // Copy the screenshot to the destination
//            FileUtils.copyFile(src, destination);

        File ss =s.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\findPro.png");
        try {
            FileUtils.copyFile(ss, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }




}
