package web_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class web_driver_connection {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());

//        System.setProperty("webdriver.gecko.driver","C:\\software\\driver\\geckodriver.exe");
//
//        WebDriver driver1 = new FirefoxDriver();
//
//        driver1.get("https://demo.nopcommerce.com/");
//        driver1.getTitle();
//        System.out.println(driver1.getTitle());
        WebDriverWait wait = new WebDriverWait(driver ,20);
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("hardik123456@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("hardik12345");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        driver.manage().window().minimize();


    }
}
