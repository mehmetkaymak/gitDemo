import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class UpdatedDropdownLooping {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        for(int i = 0 ; i < 4 ; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
            Thread.sleep(1000);
        }


        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


    }
}
