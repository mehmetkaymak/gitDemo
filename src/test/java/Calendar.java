import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver  = new ChromeDriver();

        driver.get("https://www.spicejet.com/");
       // driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
        Thread.sleep(2000);
       //driver.findElement(By.cssSelector(".'ui-state-default.ui-state-active']")).click();


        String value = driver.findElement(By.id("Div1")).getAttribute("style");
        System.out.println(value);
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        String valueAfterRound = driver.findElement(By.id("Div1")).getAttribute("style");




    }
}
