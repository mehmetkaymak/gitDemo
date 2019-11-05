import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

    public static void main(String[] args) {
        WebDriver driver ;
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        int frameNum =  driver.findElements(By.tagName("iframe")).size();
        System.out.println(frameNum);
        WebElement frameWebEle = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
        driver.switchTo().frame(frameWebEle);

        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        action.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();
        // driver.findElement(By.id("draggable")).click();
    }
}
