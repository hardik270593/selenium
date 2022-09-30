package web_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.CSS;

public class register_test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("harb");
        driver.findElement(By.id("LastName")).sendKeys("harbj");


        WebElement ddown = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(ddown);
          select.selectByValue("11");
//        select.selectByIndex(16);
//        select.selectByVisibleText("27");
        Thread.sleep(5000);
        WebElement ddown1 = driver.findElement(By.name("DateOfBirthMonth"));
        Select select1 = new Select(ddown1);
          select1.selectByValue("5");//         select.selectByIndex(05);
//        select1.selectByVisibleText("May");

        WebElement ddown2 = driver.findElement(By.name("DateOfBirthYear"));
        Select select2 = new Select(ddown2);
          select2.selectByValue("1993");
//        select.selectByIndex(1993);
//        select2.selectByVisibleText("1993");
        driver.findElement(By.id("Email")).sendKeys("hardik123456@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("spyder solution");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("Hardik@9785");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Hardik@9785");
        driver.findElement(By.id("register-button")).click();
        driver.findElement(By.className("ico-login")).click();



        driver.findElement(By.id("Email")).sendKeys("hardik123456@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Hardik@9785");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
      //maximize and minimized windows
       // driver.manage().window().minimize();

        driver.close();

    }
}
