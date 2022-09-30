package web_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge_test {
    public static void main(String[] args) {
  // driver path configuration with edg web browser.
        System.setProperty("webdriver.edge.driver","C:\\software\\driver\\msedgedriver.exe");
  //create instant for calling.
        WebDriver driver = new EdgeDriver();
  //get url for automation.
        driver.get("https://demo.nopcommerce.com/");
 //get title command.
        driver.getTitle();
        System.out.println(driver.getTitle());
        String title = driver.getTitle();

        if (title.equals("nopCommerce demo store")){
            System.out.println("page title is correct");
            }
        else {
            System.out.println("this is not ok");
        }
        if (title == "nopCommerce demo store")
        {
            System.out.println("page title is correct");
        }
        else {
            System.out.println("this is not ok");
        }

    }
}
