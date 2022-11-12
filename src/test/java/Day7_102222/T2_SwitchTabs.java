package Day7_102222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_SwitchTabs {
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
        driver.navigate().to("https://www.fideliscare.org/");

        //click on shop for a plan
        driver.findElement(By.xpath("//*[text() = 'Shop For a Plan']")).click();

        //wait a bit
        Thread.sleep(2000);

        //click on medicaid managed care
        driver.findElement(By.xpath("//*[text() = 'Medicaid Managed Care']")).click();

        //wait a bit
        Thread.sleep(2000);

        //click on find a doctor search icon (which will launch a new tab)
        driver.findElement(By.xpath("//*[@class= 'btn btn-outline-primary btn-external btn-show link-external']")).click();

        //wait a bit
        Thread.sleep(2000);

        //store the tabs in arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //switch to the new tab
        driver.switchTo().window(tabs.get(1));

        //enter a zip code on the search field
        driver.findElement(By.xpath("//*[@id = 'searchLocation']")).sendKeys("11230");

        //wait a bit
        Thread.sleep(2000);

        //close a find a doctor tab
        driver.close();

        //switch to initial tab (parent tab)
        driver.switchTo().window(tabs.get(0));

        //go to home page again
        driver.navigate().to("https://www.fideliscare.org/");

        //wait for page to load
        Thread.sleep(2000);

        //click on get coverage
        driver.findElement(By.xpath("//*[@class='btn ng-binding btn-primary']")).click();
        Thread.sleep(2000);
    }//End of main
}//End of class
