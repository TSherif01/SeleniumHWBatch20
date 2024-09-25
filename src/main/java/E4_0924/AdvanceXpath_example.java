package E4_0924;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath_example {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/advanceXpath.php");

        WebElement mostFavBk = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        mostFavBk.sendKeys("oliver twist");

        WebElement leastFavBk = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFavBk.sendKeys("textbook");

        WebElement i3= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        i3.sendKeys("book");
    }
}
