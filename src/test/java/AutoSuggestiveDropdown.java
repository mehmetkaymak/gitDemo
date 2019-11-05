import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.id("fromCity")).click();
        Thread.sleep(1000);
       // WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
    }
}
