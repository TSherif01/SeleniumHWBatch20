package E9_0930;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_example {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        WebElement Alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        Alert1.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement Alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Alert2.click();
        Thread.sleep(2000);
        alert.dismiss();

        WebElement Alert3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        Alert3.click();
        alert.sendKeys("hello");
        alert.accept();

    }
}
