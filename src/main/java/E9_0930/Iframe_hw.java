package E9_0930;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");
        driver.manage().window().maximize();

        /*
        1. Select Age Checkbox:
        - Select the **Age** checkbox.

        2. **Select City**:
        - Select any city from the dropdown.

        3. **Enter Username**:
        -enter your username in the **Username** field.
         */

        driver.switchTo().frame(0);

        WebElement topic = driver.findElement(By.xpath("//input[@name='Username']"));
        topic.sendKeys("tsherif");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("dropdownIframe");

        WebElement dd = driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel = new Select(dd);
        sel.selectByVisibleText("Chicago");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        WebElement nestedIframe = driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
        driver.switchTo().frame(nestedIframe);

        WebElement cb1 = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        cb1.click();
    }
}
