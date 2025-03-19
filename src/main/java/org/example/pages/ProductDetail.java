package org.example.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.time.Duration;

public class ProductDetail {
    private WebDriver driver;
     private WebDriverWait wait;
      public ProductDetail(WebDriver driver){
           this.driver=driver;
          this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      }
      private By size = By.xpath("(//label[@class='sc-fc819127-2 sc-fc819127-5 bcHcti ckKNWd'])[2]");
      private By addToBagButton = By.xpath("//button[contains(text(), 'add to bag ')]");
private  By gotobag= By.xpath("//button[contains(text(),'Go to bag')]");
    private By pincode = By.xpath("//input[@name='pincode']");
    private  By proceed= By.xpath("//button[contains(text(),'PROCEED')]");
private  By address = By.xpath("(//div[@class='flex flex-1 gap-4 items-center'])[2]");
private  By selectadd= By.xpath( "//button[contains(text(),'Select Address')]");
    private By backis =By.xpath("//img[@title='bewakoof logo']");

      public  void addProduct(){


          WebElement Size= wait.until(ExpectedConditions.visibilityOfElementLocated(size));
          Size.click();
          WebElement PinCode= wait.until(ExpectedConditions.visibilityOfElementLocated(pincode));
          PinCode.sendKeys("244173");
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

          WebElement add= wait.until(ExpectedConditions.visibilityOfElementLocated(addToBagButton));
          add.click();




          WebElement bag= wait.until(ExpectedConditions.visibilityOfElementLocated(gotobag));
          bag.click();

          TakesScreenshot s = (TakesScreenshot) driver;
//            File src = ss.getScreenshotAs(OutputType.FILE);
//
//            // Define the destination file with name and extension
//            File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\screenshot.png");
//
//            // Copy the screenshot to the destination
//            FileUtils.copyFile(src, destination);

          File ss =s.getScreenshotAs(OutputType.FILE);
          File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\product.png");
          try {
              FileUtils.copyFile(ss, destination);
          } catch (IOException e) {
              throw new RuntimeException(e);
          }

      }
    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Find the "Proceed" button element
        WebElement proceedButton = wait.until(ExpectedConditions.visibilityOfElementLocated(proceed));

        // Scroll to the "Proceed" button smoothly
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", proceedButton);

        // Wait and click the "Proceed" button
        WebElement pro = wait.until(ExpectedConditions.elementToBeClickable(proceed));
        pro.click();
        TakesScreenshot s = (TakesScreenshot) driver;
//            File src = ss.getScreenshotAs(OutputType.FILE);
//
//            // Define the destination file with name and extension
//            File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\screenshot.png");
//
//            // Copy the screenshot to the destination
//            FileUtils.copyFile(src, destination);

        File ss =s.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\bag.png");
        try {
            FileUtils.copyFile(ss, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


      public  void selectingAddress(){
            WebElement ele1= wait.until(ExpectedConditions.elementToBeClickable(address));
            ele1.click();
            WebElement ele2= wait.until(ExpectedConditions.elementToBeClickable(selectadd));
            ele2.click();
//

          TakesScreenshot s = (TakesScreenshot) driver;
//            File src = ss.getScreenshotAs(OutputType.FILE);
//
//            // Define the destination file with name and extension
//            File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\screenshot.png");
//
//            // Copy the screenshot to the destination
//            FileUtils.copyFile(src, destination);

          File ss =s.getScreenshotAs(OutputType.FILE);
          File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\payment.png");
          try {
              FileUtils.copyFile(ss, destination);
          } catch (IOException e) {
              throw new RuntimeException(e);
          }


      }

}
