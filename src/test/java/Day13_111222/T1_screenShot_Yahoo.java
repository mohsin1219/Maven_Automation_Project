package Day13_111222;

import ReusableLibrary.ReusableActions_Loggers;
import ReusableLibrary.ReusableAnnotations;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T1_screenShot_Yahoo extends ReusableAnnotations {
    @Test(priority = 1)
    public void tc001_verifySignedInOptionIsChecked() throws InterruptedException {
        //first navigate to yahoo homepage
        driver.navigate().to("https://www.yahoo.com/");
        //next we need to click on sign in button, XPATH is incorrect, so should take a screenshot.
        ReusableActions_Loggers.clickAction(driver,"//*[@class = '_yb_1933eyyy']",logger,"Sign In");
        //we need to verify that signed in option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        System.out.println("The checkbox check condition is: " + isSignInChecked);
        logger.log(LogStatus.INFO,"The checkbox check condition is: " + isSignInChecked);
    }//end of test 1





}
