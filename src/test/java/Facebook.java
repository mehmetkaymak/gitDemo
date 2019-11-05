import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriver driver ;
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.get("https://www.facebook.com/");
       driver.findElement(By.cssSelector("#email")).sendKeys("myusername");
        // driver.findElement(By.id("email")).sendKeys("this is my username");
       //driver.findElement(By.name("pass")).sendKeys("12345");
       // WebElement logIn = driver.findElement(By.id("u_0_2"));
      //  logIn.click();
      //  driver.findElement(By.linkText("Forgot account?")).click();
    }
}
