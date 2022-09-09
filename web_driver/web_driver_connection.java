package web_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web_driver_connection {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());

        System.setProperty("webdriver.gecko.driver","C:\\software\\driver\\geckodriver.exe");

        WebDriver driver1 = new FirefoxDriver();

        driver1.get("https://www.google.com/");
        driver1.getTitle();
        System.out.println(driver1.getTitle());


    }
}
