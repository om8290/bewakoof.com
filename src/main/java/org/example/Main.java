import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Main {
    public static void main(String[] args) throws IOException {
        // Set the path to the ChromeDriver executable


        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


            // Navigate to the desired URL
            driver.get("https://www.browserstack.com/");

            // Locate the target element
            WebElement ele = driver.findElement(By.xpath("(//h2[@class='heading '])[3]"));

        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",ele);


            // Initialize Actions class
//            Actions ac = new Actions(driver);
//
//            // Move to the target element to scroll it into view
//            ac.moveToElement(ele).perform();
//
//            // Retrieve and print the text of the element
//            String str = ele.getText();
//            System.out.println(str);
//
//            // Capture screenshot
//            TakesScreenshot ss = (TakesScreenshot) driver;
//            File src = ss.getScreenshotAs(OutputType.FILE);
//
//            // Define the destination file with name and extension
//            File destination = new File("C:\\Users\\Om Rastogi\\om01\\src\\test\\screenshot.png");
//
//            // Copy the screenshot to the destination
//            FileUtils.copyFile(src, destination);


    }
}
