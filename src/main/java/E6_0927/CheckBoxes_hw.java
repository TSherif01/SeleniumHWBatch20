package E6_0927;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes_hw {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo-homework.php");
        driver.manage().window().maximize();

        /*
        1. Subscribe to Newsletter:
        - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it. */
        WebElement subscribe = driver.findElement(By.xpath("//input[@id='newsletter']"));
        subscribe.click();

        /*2.Select Your Hobbies:
        - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
        - Traverse through the list and select the **Reading** and **Cooking** checkboxes.*/
        List<WebElement> hobbies = driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement checkBox:hobbies) {
            if (checkBox.getAttribute("value").equals("reading")) {
                checkBox.click();
            }
            if (checkBox.getAttribute("value").equals("cooking")) {
                checkBox.click();
            }
        }

        /*3. Select Your Interests:
        - Verify that the **Support** and **Music** checkboxes are not displayed by default.
        - Click on the "Show Checkboxes" button, and then select the **Music** checkbox.*/

        WebElement support = driver.findElement(By.xpath("//input[@value='Support']"));
        WebElement music = driver.findElement(By.xpath("//input[@value='Music']"));

        if(!support.isDisplayed() && !music.isDisplayed()){
            WebElement show = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
            show.click();
            Thread.sleep(2000);
            music.click();
        }
        /*4. Preferences:
        - Verify that the **Receive Notifications** checkbox is disabled.
        - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.
         */
        WebElement enable2 = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enable2.click();
        WebElement notifications = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        notifications.click();
            }
        }
