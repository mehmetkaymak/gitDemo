import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        driver.get("http://www.echoecho.com/htmlforms10.htm");

        driver.findElements(By.xpath("//input[@name='group1']"));
        int size = driver.findElements(By.xpath("//input[@name='group1']")).size();
        for(int i = 0 ; i < size ; i++){
            String val =  driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
            System.out.println(val);
           if(val.equals("Cheese")){
               driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

           }
        }



    }
}
