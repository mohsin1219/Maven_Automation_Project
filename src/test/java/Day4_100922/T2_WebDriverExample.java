package Day4_100922;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_WebDriverExample {
    public static void main(String[] args) throws InterruptedException {

        //Define the Web Driver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //Define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation
        WebDriver driver = new ChromeDriver();

        //Navigate to the google site
        driver.navigate().to("https://www.google.com");

        //Wait few seconds(milliseconds)
        Thread.sleep(3000);

        //Quit the chrome session
        driver.quit();


    }// end of main
}//End of class
