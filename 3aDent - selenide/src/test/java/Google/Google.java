package Google;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.xpath;

public class Google {
    public static WebElement element = null;


    public static void GooglePage(){
        open("https://www.google.com.ua");
            }
    public static WebElement GoogleSearch() {
        element = $(xpath("//input[contains(@name, 'q')]"));
        return element;
    }
    public static WebElement FindButton() {
        element = $(xpath("//input[contains(@name, 'btnK')]"));
        return element;
    }
    public static WebElement FirstValueURL() {
        element = $(xpath("//div[contains(@class, 's')]//span[contains(@class, 'st']"));
        return element;
    }
    public static WebElement FirstValue() {
        element = $(xpath("Стоматологічна клініка - найкращий сервіс, прийнятні ціни"));
        return element;
    }
    public static WebElement FirstLink(){
        element = $(xpath("//h3[text()='Стоматологічна клініка | Головна | 3-adent.com.ua']"));
        return element;
    }
    //    ______________________________________Here is a fill in methods________________________________________
    public static void FillInGoogleSearch(String GoogleSearch){
        element = $(xpath("//input[contains(@name, 'q')]"));
        element.sendKeys(GoogleSearch);
    }
}
