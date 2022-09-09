package web_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge_test {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\software\\driver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());
    }
}
