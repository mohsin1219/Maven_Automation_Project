package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Automation_AI2 {
    public static void main(String[] args) throws InterruptedException {

        //Arraylist for sports
        ArrayList<String> sport = new ArrayList<>();
        sport.add("Basketball");
        sport.add("Football");
        sport.add("Cricket");
        sport.add("Soccer");

        //Web driver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //Creating an instance to use chrome driver for automation
        WebDriver driver = new ChromeDriver();

        //Loop data from Arraylist
        for (int i = 0; i < sport.size(); i++) {

            //Navigate to Bing site
            driver.navigate().to("https://www.bing.com");

            //Making window full screen
            driver.manage().window().fullscreen();

            //Wait for all elements to load up
            Thread.sleep(3000);

            //Finding the search field to enter desired keyword
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sport.get(i));

            //clicking magnify class once keyword is entered
            driver.findElement(By.xpath("//*[@id='search_icon']")).click();

            //Wait for all elements to load up
            Thread.sleep(3000);

            //Capture the search result text
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();

            //Split message to extract out the search number
            String[] splitResult = result.split(" ");
            System.out.println("The search result number for " + sport.get(i) + " is " + splitResult[0]);

        }//End of loop
    }//End of main
}//End of class
