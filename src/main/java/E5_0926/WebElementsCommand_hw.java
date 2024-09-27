package E5_0926;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommand_hw {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/selenium_commands_selector-homework.php");
        driver.manage().window().maximize();

        /*1. Retrieve Attribute:
        - Retrieve the text "inspect me to view my custom attribute"
        from the element and print it on the console, ensuring the text is correct.

        //2. Meal Preference:
        - Choose the checkbox for the meal preference "Musical Festival,"
        ensuring the checkbox is enabled before clicking on it.
        - Ensure that the option for "Tech Talk" is disabled.
        - Click on "Show More Options" and ensure the "Art Exhibition" option is displayed, then click on it.

        //3. Mystery Message:
        - Retrieve the value of the attribute `title` from the element
        containing the text "Hover me to reveal the secret" and print it on the console.

        //Option Box:
        - If "Checkbox 1" is enabled, click on it.
        - Ensure that "Checkbox 2" is disabled.---

        //5. Input Field:
        - clear the text in the input box and send the text "here is
        the custom text entered" using selenium commands.*/

        WebElement textbox = driver.findElement(By.xpath("//input[@id='textInput']"));
        textbox.clear();
        textbox.sendKeys("hello world!!!");

        WebElement radio1 = driver.findElement(By.xpath("//input[@value='option1']"));
        boolean stateofR1 = radio1.isSelected();
        System.out.println("the state of radio button selection is " + stateofR1);
        radio1.click();
        radio1.isSelected();
        System.out.println("the state of radio button selection is " + stateofR1);

        WebElement radio2 = driver.findElement(By.xpath("//input[@value='option2']"));
        boolean stateofR2 = radio2.isEnabled();
        System.out.println("the state of radio button selection is " + stateofR2);

        WebElement radio3 = driver.findElement(By.xpath("//input[@value='option2']"));
        boolean displayStateofR3 = radio2.isEnabled();
        if (displayStateofR3){
            System.out.println("radio button3 is displayed");
        } else {
            System.out.println("radio button 3 is not displayed");
        }

        WebElement radioButtonVisibilityToggle = driver.findElement(By.xpath("//button[text()='Toggle Visibility of Option 3']"));
        radioButtonVisibilityToggle.click();

        displayStateofR3=radio3.isDisplayed();
        System.out.println("the radio button 3 is displayed" + displayStateofR3);

        WebElement textElement=driver.findElement(By.xpath("//div[@id='textElement']"));
        String text = textElement.getText();
        System.out.println("the text in the webelement is " + text);

        WebElement attributeElement = driver.findElement(By.xpath("//div[@id='attributeElement']"));
        String attributeVal=attributeElement.getAttribute("data-custom-attribute");
        System.out.println("the value of the data attribute is ... " + attributeVal);

    }
}
