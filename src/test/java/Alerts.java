import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver  = new ChromeDriver();
     //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
       // String  text = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        //System.out.println(text);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);



    }
}
