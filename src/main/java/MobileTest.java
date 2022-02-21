import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MobileTest {
    @Test

     void checkMobilePayment(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



        driver.get("https://next.privat24.ua/mobile");

         By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        driver.findElement(phoneNumber).sendKeys("634085456");

        By amount = By.xpath("//input[@data-qa-node='amount']");
        driver.findElement(amount).sendKeys("69");

        By numberdebitSource = By.xpath("//input[@data-qa-node='numberdebitSource']");
        driver.findElement(numberdebitSource).sendKeys("4006895689048337");

        By expiredebitSource = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(expiredebitSource).sendKeys("0323");

        By cvvdebitSource = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        driver.findElement(cvvdebitSource).sendKeys("480");

        By firstNamedebitSource = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        driver.findElement(firstNamedebitSource).sendKeys("Peter");

        By lastNamedebitSource = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        driver.findElement(lastNamedebitSource).sendKeys("Griffin");

        driver.findElement(By.xpath("//button[@data-qa-node='submit']")).click();

        driver.findElement(By.xpath(".//button[contains(text(),'Сплатити')]")).click();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//button[contains(text(),'Підтвердити')]")).click();


    }
}
