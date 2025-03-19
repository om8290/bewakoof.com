package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Backpage {
    private WebDriver driver;
    private WebDriverWait wait;
    public Backpage(WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private By backis =By.xpath("//img[@title='bewakoof logo']");

  public void  goTOback(){
      WebElement backward= wait.until(ExpectedConditions.elementToBeClickable(backis));
       backward.click();
  }
}
