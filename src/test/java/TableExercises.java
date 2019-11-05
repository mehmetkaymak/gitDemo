import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableExercises {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();

        driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970" +
                "/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

        WebElement table =  driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));

        int countRow =  driver.findElements(By.xpath("//div[@id='innings_1']/div[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
        System.out.println(countRow);
        int sum =0;
        for ( int i = 0 ; i < countRow-2 ; i++){
            System.out.println(driver.findElements(By.xpath("//div[@id='innings_1']/div[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
            String value = driver.findElements(By.xpath("//div[@id='innings_1']/div[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
            int Integervalue = Integer.parseInt(value);
             sum += Integervalue;
        }

       String extraAmount =  driver.findElement(By.xpath("(//div[text()='Extras'])[1]/following-sibling::div[1]")).getText();
        System.out.println("----------------");
        System.out.println(extraAmount);
        int IntegerExtraAmount = Integer.parseInt(extraAmount);
        sum +=  IntegerExtraAmount;
        System.out.println("sum is : " + sum);

     String totalAmount = driver.findElement(By.xpath("(//div[text()='Total'])[1]/following-sibling::div[1]")).getText();
        System.out.println(totalAmount);
        int IntegerTotalAmount = Integer.parseInt(totalAmount);

        Assert.assertEquals(sum,IntegerTotalAmount);
    }
}
