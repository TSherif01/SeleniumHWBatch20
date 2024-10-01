package E9_0930;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe_example {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe.php");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("hello");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("dropdownIframe]");

        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dd);
        sel.selectByVisibleText("Big Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);

        WebElement nestedIframe = driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        driver.switchTo().frame(nestedIframe);

        WebElement cb1 = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        cb1.click();
    }
}
