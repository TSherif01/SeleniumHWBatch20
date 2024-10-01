package E9_0930;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_hw {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");
        driver.manage().window().maximize();
/*
1. Birthday Reminder:
   - Click on the "Birthday Reminder" button.
   - When the alert appears, accept the alert.

2. Delete Confirmation:
   - Click on the **"Delete File"** button.
   - When the confirmation alert appears, **dismiss** the alert.
   - Print the status of the action (e.g., "File deletion canceled") that appears on the screen, to the console.

3. Name Collection:
   - Click on the **"Enter Your Name"** button.
   - Accept the alert and provide a name.
   - Retrieve the name that appears on the screen UI and print it on the console, verifying that the correct name is displayed.


 */
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
        alert.sendKeys("name");
        alert.accept();

    }
}
