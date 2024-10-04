package E12_1004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");
        driver.manage().window().maximize();

        /*
        1. **Print All Entries with the Country "USA"**:
        - Dynamically search the table for entries where the country is **"USA"**.
        - Print all the rows matching criteria

        2. **Dynamic Logic**:
        - Ensure the search and filtering logic is **dynamic** and does not rely on hard-coded xpaths.
        - The code should be flexible enough to accommodate changes in the country name
        - If the country name changes (e.g., from "USA" to "Canada"), the same logic should still work,
        and the output should reflect the correct entries based on the updated country.
         */

        List<WebElement> columData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));

        for (WebElement cData:columData) {
            System.out.println(cData.getText());
        }

        List<WebElement> status = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int count = 1;
        for (WebElement s :status) {
            String statusValue = s.getText();
            if (statusValue.equals("Country")){
                System.out.println(count);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr/td["+count+"]"));
                System.out.println(row.getText());

            }
            count=count+1;
        }
    }
}
