package Day6_101622;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_WebElement_Mlcalc {
    public static void main(String[] args) throws InterruptedException {
        //define the web driver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();


        //Initialize chrome options
        ChromeOptions options = new ChromeOptions();

        //Add options for maximize the chrome window
        options.addArguments("start-fullscreen");

        //options.addArguments("incognito");

        //options.addArguments("headless");

        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation
        WebDriver driver = new ChromeDriver(options);

        //navigate to the google site
        driver.navigate().to("https://www.mlcalc.com");

        Thread.sleep(3000);

        //Clear and enter a new value on purchase price field
        WebElement pPrice = driver.findElement(By.xpath(("//*[@name='ma']")));

        //Clear the purchase price
        pPrice.clear();

        //Type new value of the purchase price
        pPrice.sendKeys("450000");


        //Clear and enter new value for down payment field
        WebElement dPrice = driver.findElement(By.xpath(("//*[@name='dp']")));

        //clear the down payment
        dPrice.clear();

        //Enter new down payment value
        dPrice.sendKeys("25");



    }//End of main
}//End of class
