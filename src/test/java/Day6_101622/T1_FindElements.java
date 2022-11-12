package Day6_101622;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_FindElements {
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
        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(3000);
        //Using find elementS I want to click on second link within the group which is NEWS
        driver.findElements(By.xpath("//*[contains(@class,'_yb_sc88r')]")).get(1).click();



    }//End of main
}//End of class
