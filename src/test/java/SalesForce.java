import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.cssSelector("#username")).sendKeys("muysername");
        driver.findElement(By.id("password")).sendKeys("muysername");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        System.out.println(driver.findElement(By.id("error")).getText());

    }
}
