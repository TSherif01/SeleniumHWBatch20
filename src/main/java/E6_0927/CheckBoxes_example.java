package E6_0927;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes_example {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement cb1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean stateofcb1 = cb1.isSelected();
        if (!stateofcb1) {
            cb1.click();
        }

        List <WebElement> cb2 = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkBox:cb2) {
            if (checkBox.getAttribute("value").equals("Option-3")) {
                checkBox.click();
            }
        }


    }

}