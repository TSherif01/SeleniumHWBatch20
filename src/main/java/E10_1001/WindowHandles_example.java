package E10_1001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles_example {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

    String mainPageWH = driver.getWindowHandle();
        System.out.println("the windowhandle of the main page" + mainPageWH);

        WebElement igBtn = driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        WebElement fbBtn = driver.findElement(By.xpath("//a[text()=' Like us On Facebook ']"));

        igBtn.click();
        fbBtn.click();

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();
            if (url.equals("https://www.facebook.com/syntaxtechs/")){
                WebElement inputBox = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
                inputBox.sendKeys("hello");
                break;

            }

        }
        System.out.println("the current focus of the driver is on window " + driver.getCurrentUrl());
        driver.switchTo().window(mainPageWH);
        System.out.println("the current focus of the driver is on window " + driver.getCurrentUrl());

    }
}
