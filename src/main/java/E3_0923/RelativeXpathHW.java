package E3_0923;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RelativeXpathHW {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/Xpath-homework.php");

        //1. The user is able to enter their hobbies using XPath.
        WebElement hobbies = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("hiking, swimming, traveling");

        //2. When the user clicks the "Click Here" button using XPath., then the message `"Button clicked:"` should be displayed on the screen.
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
        System.out.println("Button Clicked");

        //3. The user successfully enters their favorite movie using XPath to find the text boxes.
        WebElement securityBox = driver.findElement(By.xpath("//input[contains(@name,'favoriteMovies')]"));
        securityBox.sendKeys("AstroBoy");

        //4. The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
        WebElement txtBx = driver.findElement(By.xpath("//label[contains(text(),'Quaerat aliquam facere adipisci,')]"));
        String txt = txtBx.getText();
        System.out.println(txt);

        //5. The user is able to enter the city in the designated field.
        WebElement api = driver.findElement(By.xpath("//input[starts-with(@id,'yourCity')]"));
        api.sendKeys("Atl");

        //6. The user must use the **indexing technique** learned in class to enter email addresses.
        WebElement emailType = driver.findElement(By.xpath("//input[@id='private_email_id']"));
        Select select = new Select(emailType);
        select.selectByIndex(0); // Selects "Personal Email"
        emailType.sendKeys("name@PrivateEmail.com");

        //7. The user must use the **operators technique** (e.g., `and`, `or`) to enter both the client name and client ID.
        WebElement clientName = driver.findElement(By.xpath("//input[@id='clientName' and @data-detail='one']"));
        clientName.sendKeys("jane dew");

        WebElement clientID = driver.findElement(By.xpath("//input[@id='clientId' and @data-detail='two']"));
        clientID.sendKeys("jdew1");

        //8. The user can use **any XPath technique** to enter the street number and house number.
        WebElement StrtNo = driver.findElement(By.xpath("//input[contains(@name,'StreetNo')]"));
        StrtNo.sendKeys("123");
        WebElement HouseNo = driver.findElement(By.xpath("//input[contains(@name,'HouseNo')]"));
        HouseNo.sendKeys("456");
    }
}
