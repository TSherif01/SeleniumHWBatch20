package E2_0922;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToLocator_hw {
    public static void main(String[] args) {
        //1. The user should fill the form using any of the locators (`id`, `name`, `tagname`, `linktext`, `partial linktext`).
        //2. If the email address is not in the correct format
        // (i.e., it doesn't contain an `@` sign), the form should not be submitted, and an error message should be displayed.
        //3. When the user clicks on the "Click Here" link, a new tab should open in the browser.
        //4. When the user clicks the "Submit" button, all the entered options should be displayed on the screen.

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://syntaxprojects.com/locator-homework.php");
        WebElement fullName = driver.findElement(By.id("first_name"));
        fullName.sendKeys("John Doe");

        WebElement email = driver.findElement(By.className("form-control"));
        email.sendKeys("johndoe@email.com");

        if (!email.equals("name@email.com")) {
            System.out.println("Invalid email format.");
        }
        else {

            WebElement clientName = driver.findElement(By.name("ClientName"));
            clientName.sendKeys("Jane Dew");

            WebElement clientId = driver.findElement(By.id("ClientId"));
            clientId.sendKeys("1234567");

            WebElement clientfdbck = driver.findElement(By.name("Clientfeedback"));
            clientfdbck.sendKeys("good site");

            WebElement prjtName = driver.findElement(By.id("ProjectNameId"));
            prjtName.sendKeys("locator hw");

            WebElement prjtTime = driver.findElement(By.id("ProjectTimeId"));
            prjtTime.sendKeys("09/22/2024 9:59pm");

            WebElement currentAdd = driver.findElement(By.id("CurrentAddressId"));
            currentAdd.sendKeys("123 street ave, city 45678");

            WebElement permAdd = driver.findElement(By.id("PermanentAddressId"));
            permAdd.sendKeys("123 street ave, city 45678");

            WebElement sbmtbutton = driver.findElement(By.tagName("button"));
            sbmtbutton.click();

            WebElement link1 = driver.findElement(By.linkText("Click Here."));
            link1.click();

            WebElement link2 = driver.findElement(By.partialLinkText("Click He"));
            link2.click();

        }
    }
}
