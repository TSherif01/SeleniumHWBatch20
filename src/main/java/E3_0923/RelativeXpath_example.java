package E3_0923;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath_example {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://syntaxprojects.com/Xpath.php");

        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("tsherif");

        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        WebElement securityBox = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        securityBox.sendKeys("What is your school name?");

        WebElement txtBx = driver.findElement(By.xpath("//label[contains(text(),'Quaerat aliquam facere adipisci,')]"));
        String txt = txtBx.getText();
        System.out.println(txt);

        WebElement api = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        api.sendKeys("hello");

        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("I am field1");





    }
}
