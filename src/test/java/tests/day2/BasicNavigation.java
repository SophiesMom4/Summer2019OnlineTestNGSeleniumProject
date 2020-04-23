package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        //lets navigate to amazon.com after google.com in the same browser.
        driver.navigate().to("http://amazon.com");

        //if I want to come back to previous page
        driver.navigate().back();

        //if i want to know the URL of the page
        String url = driver.getCurrentUrl();
        System.out.println(url);


        driver.quit();
    }

}
