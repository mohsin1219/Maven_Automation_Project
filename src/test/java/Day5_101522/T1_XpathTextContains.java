package Day5_101522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_XpathTextContains {
    public static void main(String[] args) throws InterruptedException {
        //Web driver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //Creating an instance to use chrome driver for automation
        WebDriver driver = new ChromeDriver();

        //Go to yahoo home page
        driver.navigate().to("https://www.yahoo.com");

        //Maximize the driver
        driver.manage().window().maximize();

        //Click on sign in button
        driver.findElement(By.xpath("//*[text()='sign in']")).click();

        //wait 2 seconds
        Thread.sleep(2000);

        //Go to yahoo home page
        driver.navigate().to("https://www.yahoo.com");

        //wait 2 seconds
        Thread.sleep(1000);

        //click on the bell icon
        driver.findElement(By.xpath("//*[contains(@class,'rapid-nonanchor')]")).click();

        //wait 2 seconds
        Thread.sleep(2000);

        //quit chrome
        driver.quit();


    }//End of main
}//End of class
