package Registration;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.xpath;
public class OnlineRegistrationPage {
    public static WebElement element = null;


        //________________________________________________________Buttons to transfer to the register form_________________________________________

    public static WebElement OnlineRegistrationButton() {
        element = $(xpath("//a[text()='Online запис']"));
        return element;
    }
    public static WebElement OnlineRegistrationButton2() {
        element = $(xpath("//a[text()='Записатись на прийом']"));
        return element;
    }
    public static void GetTheOnlineRegistrationPage(){
        open("https://www.3-adent.com.ua/online-zapise/reservuvati/");
    }
    //_________________________________________________________Here is a fields for the online registration___________________________________
    public static WebElement PatientName() {
        element = $(xpath("//input[@id='id_name']"));
        return element;
    }
    public static WebElement PatientLastName() {
        element = $(xpath("//input[@id='id_prizv']"));
        return element;
    }
    public static WebElement PhoneNumber() {
        element = $(xpath("//input[@id='id_tel']"));
        return element;
    }

    public static WebElement Calendar() {
        element = $(xpath("//input[@id='form_date_picker']"));
        return element;
    }

    public static WebElement ProblemDescription() {
        element = $(xpath("//textarea[@id='id_problem']"));
        return element;
    }


    //__________________________________________________________Here is gonna be a useful methods_____________________________________________
    public static void FillInPatientName(String PatientName){
        element = PatientName();
        element.sendKeys(PatientName);
    }
    public static void FillInPatientLastName(String PatientLastName){
        element = PatientLastName();
        element.sendKeys(PatientLastName);
    }
    public static void FillInPhoneNUmber(String PhoneNumber){
        element = PhoneNumber();
        element.sendKeys(PhoneNumber);
    }
    public static void FillInCalendar(String CalendarDate){
        element = Calendar();
        element.sendKeys(CalendarDate);
    }
    public static void FillInProblemDescription(String ProblemDescription){
        element = ProblemDescription();
        element.sendKeys(ProblemDescription);
    }



}
