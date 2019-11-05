import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class childWindow {
    public static void main(String[] args) {
        WebDriver driver ;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://support.google.com/accounts/answer/27441?hl=en");

        driver.findElement(By.xpath(".//a[text()='CREATE A GOOGLE ACCOUNT']   ")).click();
        String parentWinTitle =  driver.getTitle();
        System.out.println(parentWinTitle);

        Set<String> ids =   driver.getWindowHandles();
        List<String> windowsids = new ArrayList<String>(ids);
        System.out.println(windowsids);
        String firstWinid = windowsids.get(0);
        String firstChildWinid = windowsids.get(1);
        driver.switchTo().window(firstChildWinid);
        String firstChildWinTit =  driver.getTitle();
        System.out.println(firstChildWinTit);





       // Iterator<String> id = ids.iterator();
       // String parentid =  id.next();
       // String childid = id.next();
        //driver.switchTo().window(childid);
        //String childWinTit = driver.getTitle();
        //System.out.println(childWinTit);



    }
}
