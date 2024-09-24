package E3_0923;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) {
        //1. The user is able to enter their hobbies using XPath.
        //2. When the user clicks the "Click Here" button using XPath.,
        //   Then the message `"Button clicked:"` should be displayed on the screen.
        //3. The user successfully enters their favorite movie using XPath to find the text boxes.
        //4. The user uses the `contains()`
        // method of XPath to locate a specific text element on the page and prints it to the console.
        //5. The user is able to enter the city in the designated field.
        //6. The user must use the **indexing technique** learned in class to enter  email addresses.
        //7. The user must use the **operators technique** (e.g., `and`, `or`)
        // to enter both the client name and client ID.
        //8. The user can use **any XPath technique** to enter the street number and house number.

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://syntaxprojects.com/Xpath.php");

        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("tsherif");

        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        WebElement securityBox = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        securityBox.sendKeys("What is your school name?");




    }
}
