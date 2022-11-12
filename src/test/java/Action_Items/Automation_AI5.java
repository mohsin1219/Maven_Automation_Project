package Action_Items;

import ReusableLibrary.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Automation_AI5 {

    WebDriver driver;
    @BeforeSuite
    public void setupDriver() {
        driver = ReusableActions.setUpDriver();
    }//end of setupDriver method

//    @AfterSuite
//    public void quitSession(){
//        driver.quit();
//    }//end of quitSession method

    @Test(priority = 1)
    public void testCase1() throws InterruptedException {
        driver.navigate().to("https://www.uhc.com");
        ReusableActions.clickAction(driver,"//*[@aria-label='Find a doctor']", "Find a Doctor link");
        ReusableActions.scrollByView(driver, "//*[contains(@aria-label,'Find a dentist Opens a new window')]", "bring to view Dentist link" );
        ReusableActions.SwitchToTabByIndex(driver, 1);
        Thread.sleep(10000);
        ReusableActions.clickActionByIndex(driver, "//*[contains(@class,'img')]", 0,"employer and individual plan link");
    }//end of test case 1

    @Test(priority = 2)
    public void testCase2(){
        ReusableActions.sendKeysAction(driver, "//*[contains(@name,'input')]", "11218", "entering zipcode");



    }










}//End of class
