package E11_1003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Implicit_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement bttn = driver.findElement(By.xpath("//button[text()='Click me!']"));
        bttn.click();

        WebElement cb1 = driver.findElement(By.xpath("//input[@value='Option-1']"));
        cb1.click();

    }
}
