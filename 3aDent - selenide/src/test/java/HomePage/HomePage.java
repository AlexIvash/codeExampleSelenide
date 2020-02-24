package HomePage;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.xpath;

public class HomePage {
    public static WebElement element = null;
    public static void HomePage() {
        open("https://www.3-adent.com.ua/");
    }

        //_____________________________________Here is the menu buttons on the HomePage_________________________________________________

    public static WebElement ProfessionalHygieneButton() {
        element = $(xpath("//a[text()='Професійна гігієна']"));
        return element;
    }
    public static WebElement CariesTreatmentButton(){
        element = $(xpath("//a[text()='Лікування карієсу']"));
        return element;
    }
    public static WebElement ToothCanalTreatmentButton(){
        element = $(xpath("//a[text()='Лікування каналів']"));
        return element;
    }
    public static WebElement PeriodontologyButton(){
        element = $(xpath("//a[text()='Парадонтологія']"));
        return element;
    }
    public static WebElement AdultSurgeryButton(){
        element = $(xpath("//a[text()='Доросла хірургія']"));
        return element;
    }
    public static WebElement ImplantationButton(){
        element = $(xpath("//a[text()='Імплантація']"));
        return element;
    }
    public static WebElement OrthodonticsButton(){
        element = $(xpath("//a[text()='Ортодонтія']"));
        return element;
    }
    public static WebElement ChildSurgeryButton(){
        element = $(xpath("//a[text()='Дитячий хірургія']"));
        return element;
    }
    public static WebElement ProstheticsButton(){
        element = $(xpath("//a[text()='Протезування']"));
        return element;
    }
    public static WebElement ChildSurveyButton(){
        element = $(xpath("//a[text()='Дитячий прийом']"));
        return element;
    }
    public static WebElement SurgeryButton(){
        element = $(xpath("//a[text()='Доросла хірургія']"));
        return element;
    }
    public static WebElement Implantation(){
        element = $(xpath("//a[text()='Імплантація']"));
        return element;
    }
}