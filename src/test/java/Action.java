import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();

        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=261614678572&hvpos=1t1&hvnetw=g&hvrand=" +
                "4953099154925648176&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvd" +
                "vcmdl=&hvlocint=&hvlocphy=9021429&hvtargid=kwd-10573980&ref=pd_sl_7" +
                "j18redljs_e&hydadcr=28883_11375890&gclid=EAIaIQobChMIl9_A0fCC5AIVi47ICh1j5gViEAAYASAAEgJq-vD_BwE");

        Actions action =  new Actions(driver);
        WebElement target =  driver.findElement(By.id("nav-link-accountList"));
      //  action.moveToElement(target).contextClick().build().perform();
        action.contextClick(target).build().perform();
         // WebElement searchBox =  driver.findElement(By.id("twotabsearchtextbox"));
          // keyDown(Keys.SHIFT)  is for capital letters
         //action.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("HELLO").build().perform();


    }
}
