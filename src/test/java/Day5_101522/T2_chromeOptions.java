package Day5_101522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_chromeOptions {
    public static void main(String[] args) throws InterruptedException {
        //define the web driver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();


        //Initialize chrome options
        ChromeOptions options = new ChromeOptions();

        //Add options for maximize the chrome window
        options.addArguments("start-fullscreen");

        //Opens the browser in incognito mode
        options.addArguments("incognito");

        //Runs the code without the browser opening
        options.addArguments("headless");

        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation
        WebDriver driver = new ChromeDriver(options);

        //navigate to the google site
        driver.navigate().to("https://www.google.com");

        //maximize my window
        //for windows
        //driver.manage().window().maximize();
        //for mac
        //driver.manage().window().fullscreen();

        //sleep statement
        Thread.sleep(3000);

        //search a keyword on the search field
        //relative xpath to locate the element
        //the element goes into "//*[@...]" format
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Cars");
        //hit submit on the google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

        //sleep statement
        Thread.sleep(3000);

        //capture the search result text
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //split message to extract out the search number
        String[] splitResult = result.split(" ");
        System.out.println("the search number is " + splitResult[1]);

        //quit the driver to end the session
        driver.quit();




    }//End of main
}//End of class
