import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase3 {

    public static void main(String[] args) {
        //   System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver  =  new ChromeDriver();

        driver.get("https://www.google.com");
        // String title = driver.getTitle();
        // System.out.println(title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        // driver.quit();
        driver.navigate().to("https://www.yahoo.com/");

        driver.navigate().back();
        driver.quit();
    }
}
