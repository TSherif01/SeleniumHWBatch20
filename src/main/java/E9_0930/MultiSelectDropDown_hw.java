package E9_0930;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown_hw {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");
        driver.manage().window().maximize();
/*
1. Select List Demo:
   - Use the **Select** class to select the option **"Pear"** from the dropdown.
   - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
   - Use the **getOptions** method to retrieve all options from the dropdown and print them on the console.

2. Select Multiple Options:
   - First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.
   - Using the **Select** class, make the following selections:
     - **Traveling**
     - **Cooking**
     - **Gardening**
   - Click the **"Get All Selected"** button and print the result on the console.
   - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
   - Click the **"Get All Selected"** button again and print the result on the console.


 */
        WebElement dd = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));

        Select sel = new Select(dd);
        sel.selectByValue("Pear");
        boolean MultiS = sel.isMultiple();
        System.out.println("the dropdown is multi-select " + MultiS);

        WebElement ms = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select multSel = new Select(ms);

        multSel.selectByIndex(1);
        multSel.selectByVisibleText("Gardening");
        multSel.selectByValue("Cooking");

        WebElement click = driver.findElement(By.xpath("//button[@id='get_all']"));
        click.click();

        boolean msPrint = multSel.isMultiple();
        System.out.println("the dropdown is multi-select " + msPrint);

        Thread.sleep(5000);
        multSel.deselectByIndex(1);

        System.out.println("the dropdown is multi-select " + msPrint);
    }
}
