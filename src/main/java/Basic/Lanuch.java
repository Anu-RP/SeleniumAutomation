package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Lanuch {
    public static void main(String[] args) throws InterruptedException {
        // /Users/prashanthkumar/Desktop/Selenium/src/main/resources/chromedriver
        String path= System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+
                "resources"+ File.separator+ "chromedriver";

        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
//        driver.close();

    }
}
