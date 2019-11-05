import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class assignmentHandlingMultipleWindows {
    public static void main(String[] args) {
        WebDriver driver ;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHereButton =  driver.findElement(By.xpath(".//a[text()='Click Here']"));
        clickHereButton.click();

       Set<String>  ids =  driver.getWindowHandles();
        List<String > windowids = new ArrayList<String>(ids);
        String parentid = windowids.get(0);
        String childid = windowids.get(1);

        driver.switchTo().window(childid);
        String childWinTitle = driver.getTitle();
        System.out.println(childWinTitle);
        driver.switchTo().window(parentid);
        String parentWinTitle =  driver.getTitle();
        System.out.println(parentWinTitle);







    }
}
