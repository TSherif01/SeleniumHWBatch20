package E4_0924;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_example {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/cssSelector.php");

        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("12345");

        WebElement profileBx = driver.findElement(By.cssSelector("input#profileBox"));
        profileBx.sendKeys("tsherif");

        WebElement Jenny = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        Jenny.sendKeys("good");

        WebElement course = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        course.sendKeys("syntax selenium");

        WebElement advancedCSS = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        advancedCSS.sendKeys("name^ -> startsWith");

        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']']"));
        conclusion.sendKeys("name$ -> endsWith");

    }
}
