package E11_1003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        driver.manage().window().maximize();

        WebElement enable = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enable.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        WebElement button = driver.findElement(By.xpath("//button[text()='Button']"));
        button.click();

        WebElement button2 = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        button2.click();
        //wait until checkbox is selected
        // i need to wait until the checkbox is selected and print the status of selection on console
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
        WebElement cb = driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println (cb.isSelected());

    }
}
