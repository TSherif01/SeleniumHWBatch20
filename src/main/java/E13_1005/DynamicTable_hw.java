package E13_1005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable_hw {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        boolean isnotfound = true;
        while (isnotfound) {
            for (int i = 0; i < ids.size(); i++) {
                if (ids.get(i).getText().equals("110307A")) {
                    WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]"));
                    row.click();
                    isnotfound = false;
                }
            }
            if (isnotfound) {
                WebElement nxtBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nxtBtn.click();
            }
        }
    }
}
