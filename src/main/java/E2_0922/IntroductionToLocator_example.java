package E2_0922;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToLocator_example {
    public static void main(String[] args) {
        //1. The user should fill the form using any of the locators (`id`, `name`, `tagname`, `linktext`, `partial linktext`).
        //2. If the email address is not in the correct format
        // (i.e., it doesn't contain an `@` sign), the form should not be submitted, and an error message should be displayed.
        //3. When the user clicks on the "Click Here" link, a new tab should open in the browser.
        //4. When the user clicks the "Submit" button, all the entered options should be displayed on the screen.

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://syntaxprojects.com/input-form-locator.php");
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Doe");

        WebElement email = driver.findElement(By.className("form-control-01"));
        email.sendKeys("johndoe@email.com");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement link1 = driver.findElement(By.linkText("Click Here."));
        link1.click();

        WebElement link2 = driver.findElement(By.partialLinkText("Link"));
        link2.click();

    }
}
