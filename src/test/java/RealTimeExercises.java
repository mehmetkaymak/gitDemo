import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class RealTimeExercises {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://www.qaclickacademy.com/practice.php");

        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerNav =  driver.findElement(By.id("gf-BIG"));
        System.out.println(footerNav.findElements(By.tagName("a")).size());
        WebElement columnfooterdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']//ul"));
        int  count = columnfooterdriver.findElements(By.tagName("a")).size();
        System.out.println(columnfooterdriver.findElements(By.tagName("a")).size());

        for(  int i = 1 ; i < count ; i ++){
            String clickOnTabs= Keys.chord(Keys.CONTROL,Keys.ENTER);
            columnfooterdriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTabs);
           Thread.sleep(5000);
        }
Set<String > ids = driver.getWindowHandles();
        Iterator<String>  id = ids.iterator();
        while(id.hasNext()){
            driver.switchTo().window(id.next());
            System.out.println(driver.getTitle());
        }

    }
}
