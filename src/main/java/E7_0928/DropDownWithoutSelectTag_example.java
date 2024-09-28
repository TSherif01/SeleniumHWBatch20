package E7_0928;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelectTag_example {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement noSelect = driver.findElement(By.xpath("//div[@data-toggle=\"dropdown\"]"));
        noSelect.click();

        List <WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for (WebElement option:options){
            String optionText = option.getText();
            if (optionText.equals("Peru")) {
                option.click();
            }
        }
    }
}
