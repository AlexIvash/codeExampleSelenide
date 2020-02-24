package Registration;

import org.junit.Test;
import org.openqa.selenium.Keys;

import static Registration.OnlineRegistrationPage.*;
import static com.codeborne.selenide.Condition.value;
public class OnlineRegistrationScenarioTests {
    @Test
    public void RegistrationFillInPositive1() {
        //Here is a smoke test to fill in all the fields with valid data and send the request
        //All the data according to positive conditions of TestCase


        GetTheOnlineRegistrationPage();
        FillInPatientName("Test");
        FillInPatientLastName("Test");
        FillInPhoneNUmber("0681845213");
        Calendar().clear();
        FillInCalendar("2019-05-25");
        Calendar().sendKeys(Keys.TAB);
        FillInProblemDescription("Нужно срочно всё протестировать");
        ProblemDescription().getText().equals(value("Нужно срочно всё протестировать"));
    }
    @Test
    public void RegistrationProblemDescriptionEmpty2() {
        //Given acceptance criteria: "we can't send uniform with empty field 'Problem Description'"
        //All the data according to positive conditions of TestCase except Problem Description


        GetTheOnlineRegistrationPage();
        FillInPatientName("Test");
        FillInPatientLastName("Test");
        FillInPhoneNUmber("0681845213");
        Calendar().clear();
        FillInCalendar("2019-05-25");
        Calendar().sendKeys(Keys.TAB);
    }
    @Test
    public void RegistrationProblemDescriptionTooLong() {
        //Given acceptance criteria that we can't send uniform with two much symbols
        //All the data according to positive conditions of TestCase except Problem Description

        GetTheOnlineRegistrationPage();
        FillInPatientName("Test");
        FillInPatientLastName("Test");
        FillInPhoneNUmber("0681845213");
        Calendar().clear();
        FillInCalendar("2019-05-25");
        Calendar().sendKeys(Keys.TAB);
        FillInProblemDescription("Нужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестировать");
    }

    @Test
    public void RegistrationWhenProblemDescriptionLessThan8Symbols() {
        //Given acceptance criteria that we can't send uniform with two much symbols
        //All the data according to positive conditions of TestCase except Problem Description


        GetTheOnlineRegistrationPage();
        FillInPatientName("Test");
        FillInPatientLastName("Test");
        FillInPhoneNUmber("0681845213");
        Calendar().clear();
        FillInCalendar("2019-05-25");
        Calendar().sendKeys(Keys.TAB);
        FillInProblemDescription("Нужно ср");

    }
    @Test
    public void RegistrationWhenWeDoNotHavePatientName() {
        //Here is a smoke test to fill in all the fields with valid data and send the request
        //All the data according to positive conditions of TestCase


        GetTheOnlineRegistrationPage();
        FillInPatientName("");
        FillInPatientLastName("");
        FillInPhoneNUmber("0681845213");
        Calendar().clear();
        FillInCalendar("2019-05-25");
        Calendar().sendKeys(Keys.TAB);
        FillInProblemDescription("Нужно срочно всё протестировать");
        ProblemDescription().getText().equals(value("Нужно срочно всё протестировать"));
    }
    @Test
    public void Registration_When_Phone_Number_doesnt_filled_in() {
        //Here is a smoke test to fill in all the fields with valid data and send the request
        //All the data according to positive conditions of TestCase


        GetTheOnlineRegistrationPage();
        FillInPatientName("Test");
        FillInPatientLastName("Test");
        FillInPhoneNUmber("");
        Calendar().clear();
        FillInCalendar("2019-05-25");
        Calendar().sendKeys(Keys.TAB);
        FillInProblemDescription("Нужно срочно всё протестировать");
        ProblemDescription().getText().equals(value("Нужно срочно всё протестировать"));
        //should be an assertion that form has been sent
    }
    @Test
    public void Registration_When_Phone_Number_and_Description_doesnt_filled_in() {
        //Here is a smoke test to fill in all the fields with valid data and send the request
        //All the data according to positive conditions of TestCase


        GetTheOnlineRegistrationPage();
        FillInPatientName("Test");
        FillInPatientLastName("Test");
        FillInPhoneNUmber("");
        Calendar().clear();
        FillInCalendar("2019-05-25");
        Calendar().sendKeys(Keys.TAB);
        FillInProblemDescription("Нужно срочно всё протестировать");
        ProblemDescription().getText().equals(value(""));
    }
    @Test
    public void RegistrationWhenCalendarIsEmpty() {
        //Given acceptance criteria that we can't send uniform with two much symbols
        //All the data according to positive conditions of TestCase except Problem Description

        GetTheOnlineRegistrationPage();
        FillInPatientName("Test");
        FillInPatientLastName("Test");
        FillInPhoneNUmber("0681845213");
        Calendar().clear();
        FillInCalendar("");
        Calendar().sendKeys(Keys.TAB);
        FillInProblemDescription("Нужно срочно всё протестировать");

    }
    @Test
    public void RegistrationWhenCalendarIsPartialFilledIn() {
        //Given acceptance criteria that we can't send uniform with two much symbols
        //All the data according to positive conditions of TestCase except Problem Description

        GetTheOnlineRegistrationPage();
        FillInPatientName("Test");
        FillInPatientLastName("Test");
        FillInPhoneNUmber("0681845213");
        Calendar().clear();
        FillInCalendar("2019-05");
        Calendar().sendKeys(Keys.TAB);
        FillInProblemDescription("Нужно срочно всё протестировать");
    }
}

