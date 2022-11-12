package Day7_102222;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//TEST, VALUE & INDEX - is how to select from dropdown
public class T1_Select_Statement {
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

        driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();

        //Use select command for month dropdown
       WebElement strtMonth =  driver.findElement(By.xpath("//*[@name='sm']"));
       Select startMonthDropDown = new Select(strtMonth);

       //Select visible text
       startMonthDropDown.selectByVisibleText("Nov");

//        //Use select command for year dropdown
//        WebElement strtYear =  driver.findElement(By.xpath("//*[@name='sy']"));
//        Select startYearDropDown = new Select(strtYear);
//
//        //Select visible text
//        startYearDropDown.selectByVisibleText("2023");

        //Selecting testing using text element
        driver.findElement(By.xpath("//*[@name='sy']")).click();
        driver.findElement(By.xpath("//*[text()='2023']")).click();

    }//End of main
}//End of class
