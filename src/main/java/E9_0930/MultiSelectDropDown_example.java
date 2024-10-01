package E9_0930;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown_example {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dd = driver.findElement(By.xpath("//select[@id='multi-select']"));

        Select sel = new Select(dd);
        boolean MultiS = sel.isMultiple();
        System.out.println("the dropdown is multi-select " + MultiS);

        sel.selectByIndex(0);
        sel.selectByVisibleText("New Jersey");
        sel.selectByValue("Texas");
        Thread.sleep(2000);
        sel.deselectByIndex(0);
    }
}
