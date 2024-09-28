package E7_0928;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelectTag_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");
        driver.manage().window().maximize();

        WebElement fruit = driver.findElement(By.xpath("//div[@id='dream_fruits'and@data-toggle=\"dropdown\"]"));
        fruit.click();

        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        for (WebElement option:options){
            String optionText = option.getText();
            if (optionText.equals("Pear")) {
                option.click();
            }
        }

        WebElement hobbies = driver.findElement(By.xpath("//div[@id='favorite_hobbies'and@data-toggle=\"dropdown\"]"));
        hobbies.click();

        List<WebElement> options2 = driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for (WebElement option2:options2){
            String optionText = option2.getText();
            if (optionText.equals("Traveling")) {
                option2.click();
            }
        }
    }
}
