import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableSort {

    public static void main(String[] args) {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        WebElement vegFruNameHeader =  driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]/b"));
        vegFruNameHeader.click();
       vegFruNameHeader.click();
        int countRow = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr/td[2]")).size();
        System.out.println(countRow);

       List<WebElement>  originalVeg = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr/td[2]"));

        ArrayList<String>  orignalFruitNames = new ArrayList<String>();
        for(int i = 0 ; i < countRow ; i++ ){
            orignalFruitNames.add(originalVeg.get(i).getText());
            System.out.println(orignalFruitNames.get(i));

        }
       // System.out.println(orignalFruitNames);
        System.out.println("*************************");
        ArrayList<String>  copiedList =  new ArrayList<String>(orignalFruitNames);
        Collections.sort(copiedList);
        for(String s :  copiedList ){
            System.out.println(s);
        }

        Assert.assertEquals(orignalFruitNames,copiedList);

    }
}
