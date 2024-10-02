package E10_1001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles_hw {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");
        driver.manage().window().maximize();

    String mainPageWH = driver.getWindowHandle();
        System.out.println("the window handle of the main page" + mainPageWH);

        WebElement B1 = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        WebElement B2 = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));

        B1.click();
        B2.click();

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();
            if (url.equals("https://syntaxprojects.com/b1-page.php")){
                break;
            }
            if (url.equals("https://syntaxprojects.com/b2-page.php")){
                break;
            }

        }
        System.out.println("the current focus of the driver is on window " + driver.getCurrentUrl());
        driver.switchTo().window(mainPageWH);
        System.out.println("the current focus of the driver is on window " + driver.getCurrentUrl());

    }
}
