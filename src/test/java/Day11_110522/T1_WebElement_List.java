package Day11_110522;

import ReusableLibrary.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;

public class T1_WebElement_List {
    WebDriver driver;
    static int timeout = 10;
    ArrayList<WebElement> totalMenuHeaders, mainMenuHeaders;
    @BeforeSuite
    public void SetChromeDriver() {
        driver = ReusableActions.setUpDriver();
        //navigate to usps.com home page
        driver.navigate().to("https://www.usps.com/");
        //store all the elements of the menu header into an arraylist of webelements
        totalMenuHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'nav-list']/li")));
    }//end of set driver method
    @AfterSuite
    public void quitTheSession() {
        driver.quit();
    }//end of after suite

    public static void scrollByView(WebDriver driver, String xpath, String elementName) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            jse.executeScript( "arguments[0].scrollIntoView(true);", element);
            element.click();
        } catch (Exception e) {
            System.out.println("Unable to scroll to element: " + elementName + " for reason: ");
        }
    }//End of bringToView action

    public static void SwitchToTabByIndex(WebDriver driver, int Index) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(Index));

    }

    public static void selectByText(WebDriver driver, String xpath, String userInput, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select dropDown = new Select(element);
            dropDown.selectByVisibleText(userInput);

        } catch (Exception e) {
            System.out.println("Unable to get dropDown:" + elementName + "for reason" + e);
        }
    }//End of selectByText action







}//End of class
