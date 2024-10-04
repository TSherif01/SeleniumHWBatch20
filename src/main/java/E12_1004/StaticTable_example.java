package E12_1004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable_example {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        driver.manage().window().maximize();

        List <WebElement> allRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));

        for (WebElement row:allRows) {
            System.out.println(row
                    .getText());
        }

        List<WebElement> columData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        for (WebElement cData:columData) {
            System.out.println(cData.getText());
        }

        List<WebElement> status = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int count = 1;
        for (WebElement s :status) {
            String statusValue = s.getText();
            if (statusValue.equals("in progress")){
                System.out.println(count);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr/td["+count+"]"));
                System.out.println(row.getText());

            }
            count=count+1;
        }
    }
}
