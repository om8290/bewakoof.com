package org.example.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locator
    private By loginBtn = By.xpath("//span[@color='black']");
private  By TelphoneNumber= By.xpath("//input[@type='tel']");
 private  By Submit1 = By.xpath("//input[@type='submit']");
private  By Submit2= By.xpath("//input[@type='submit']");



    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public void clickLoginButton() {
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        btn.click();
        WebElement input= wait.until(ExpectedConditions.visibilityOfElementLocated(TelphoneNumber));
        input.sendKeys("9917839363");
        WebElement submit= wait.until(ExpectedConditions.elementToBeClickable(Submit1));
         submit.click();

        TakesScreenshot s = (TakesScreenshot) driver;
//            File src = ss.getScreenshotAs(OutputType.FILE);
//
//            // Define the destination file with name and extension
//            File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\screenshot.png");
//
//            // Copy the screenshot to the destination
//            FileUtils.copyFile(src, destination);

        File ss =s.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\number.png");
        try {
            FileUtils.copyFile(ss, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public  void Otp(){
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement submit= wait.until(ExpectedConditions.elementToBeClickable(Submit2));
        submit.click();
        TakesScreenshot s = (TakesScreenshot) driver;
//            File src = ss.getScreenshotAs(OutputType.FILE);
//
//            // Define the destination file with name and extension
//            File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\screenshot.png");
//
//            // Copy the screenshot to the destination
//            FileUtils.copyFile(src, destination);

        File ss =s.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\otp.png");
        try {
            FileUtils.copyFile(ss, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
