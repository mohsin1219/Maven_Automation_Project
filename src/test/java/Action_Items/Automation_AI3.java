package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_AI3 {
    public static void main(String[] args) throws InterruptedException {

        //Driver manager setup for chrome driver
        WebDriverManager.chromedriver().setup();

        //Calling Chrome options
        ChromeOptions options = new ChromeOptions();

        //Opening browser in incognito mode
        options.addArguments("Incognito");

        //Open browser in full screen mode
        options.addArguments("start-fullscreen");

        //Creating an instance of chrome driver with chrome options
        WebDriver driver = new ChromeDriver(options);

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11218");
        zipCode.add("10701");
        zipCode.add("10018");

        for (int i=0;i<zipCode.size();i++){

            //Navigating to weight watcher site
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");

            //Adding a wait for all elements to load
            Thread.sleep(3000);

            //Click on find a workshop in the top right corner
            driver.findElements(By.xpath("//*[contains(@class,'listItem-2dwoL')]")).get(4).click();

            Thread.sleep(3000);
            //Clicking on in person link
            driver.findElements(By.xpath("//*[contains(@class,'buttonText-3DCCO')]")).get(0).click();

            //Waiting for all elements to load
            Thread.sleep(3000);

            //Locating search field and entering zipcode
            WebElement searchBar =  driver.findElement(By.xpath("//*[@id='location-search']"));

            //Clear the search field
            searchBar.clear();

            //Sending zipcode from Array list
            searchBar.sendKeys(zipCode.get(i));

            //Waiting for all elements to load
            Thread.sleep(3000);

            //Click on search arrow
            driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();

            //Waiting for all elements to load
            Thread.sleep(3000);

            //Clicking on specific studio links
            if (i==0){
                driver.findElements(By.xpath("//*[contains(@class,'linkUnderline-1_h4g')]")).get(1).click();
            } else if (i==1) {
                driver.findElements(By.xpath("//*[contains(@class,'linkUnderline-1_h4g')]")).get(2).click();
            } else if (i==2) {
                driver.findElements(By.xpath("//*[contains(@class,'linkUnderline-1_h4g')]")).get(0).click();
            }//End of conditions

            //Waiting for all elements to load
            Thread.sleep(3000);

            //Retrieving the stored address
            String address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();

            String[] splitResult = address.split(" ");

            System.out.println("The address is: " + splitResult[1]);
        }//End of loop
    }//End of main
}//End of class
