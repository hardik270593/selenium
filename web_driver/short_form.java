package web_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class short_form {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
  //   this will allow you to make short format we can create j like variable
        WebElement j = driver.findElement(By.id("Email"));
        j.sendKeys("hardik@123");

    }
}
