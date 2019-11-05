import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();

        driver.get("https://www.spicejet.com");
        boolean select = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
        System.out.println(select);
        Assert.assertFalse(select);
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

        boolean afterselect = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
        System.out.println(afterselect);
        Assert.assertTrue(afterselect);


    }
}
