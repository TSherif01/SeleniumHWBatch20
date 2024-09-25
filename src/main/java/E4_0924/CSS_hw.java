package E4_0924;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/cssSelector-homework.php");

        //1. The user should fill in all the text boxes in the form using
        // *CSS selectors that are unique and return only one element (1/1).

        WebElement userID = driver.findElement(By.cssSelector("input[id='UserID']"));
        userID.sendKeys("12345");

        WebElement userName = driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("tsherif");

        WebElement Ray = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        Ray.sendKeys("good");

        WebElement clientID = driver.findElement(By.cssSelector("input[name*='ClientID']"));
        clientID.sendKeys("syntax selenium");

        WebElement email = driver.findElement(By.cssSelector("input[name^='em']"));
        email.sendKeys("name^ -> startsWith");

        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Topic']"));
        conclusion.sendKeys("name$ -> endsWith");

    }
}
