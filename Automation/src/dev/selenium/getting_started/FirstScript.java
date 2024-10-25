// youtube testing
package dev.selenium.getting_started;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

import java.time.Duration;

public class FirstScript {
    // FIRST PROJECT CLASS ADDED
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        String title=driver.getTitle();
        System.out.println(title);
        
    

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement Home = driver.findElement(By.xpath("//*[@id=\"endpoint\"]/tp-yt-paper-item/yt-formatted-string"));
        Home.click();

        driver.quit();
    }
}
