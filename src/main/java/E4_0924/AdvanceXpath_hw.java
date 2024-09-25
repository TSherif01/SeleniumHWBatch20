package E4_0924;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/advanceXpath-homework.php");

        /*1.The user should enter the names of books in reverse
        order from least favorite to favorite using advanced Xpath
        (such as `parent`, `following-sibling`, or `preceding-sibling`).*/
        WebElement leastFavBk1 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFavBk1.sendKeys("book1");
        WebElement leastFavBk2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        leastFavBk2.sendKeys("book2");
        WebElement leastFavBk3 = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        leastFavBk3.sendKeys("book3");

        //2. The user should enter the name of their favorite book using advanced Xpath.
        WebElement mostFavBk1 = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        mostFavBk1.sendKeys("oliver twist");
        WebElement mostFavBk2 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        mostFavBk2.sendKeys("book2");
        WebElement mostFavBk3 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        mostFavBk3.sendKeys("book3");

        //3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
        WebElement grandParent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandParent.sendKeys("granny");
        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("mom");
        WebElement child= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("kid");

        driver.quit();
    }
}
