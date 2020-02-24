package Registration;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static Registration.OnlineRegistrationPage.*;
public class OnlineRegistrationSimpleTest {

    @Test
    public void UncorrectSymbolsInCalendar(){
        //Here we are testing that any symbols in Calendar field can't be accepted. So the value after we are trying to enter it should be empty
        GetTheOnlineRegistrationPage();

        Calendar().getText().equals(Condition.value(""));;

    }
    @Test
    public void WhiteSpacesInCalendar(){
        //Here we are testing that White Spaces in Calendar field can't be accepted. SO the value after we are trying to enter it should be empty
        GetTheOnlineRegistrationPage();
        Calendar().click();
        Calendar().sendKeys("   ");
        Calendar().getText().equals(Condition.value(""));
    }
    @Test
    public void ProblemFieldPositiveTest() {
        GetTheOnlineRegistrationPage();
        Calendar().click();
        Calendar().sendKeys("");
        Calendar().getText().equals(Condition.value(""));
    }
    @Test
    public void ProblemFieldTest() {
        ProblemDescription().click();
        ProblemDescription().sendKeys("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        ProblemDescription().getText().equals(Condition.value("TestTestTestTest"));
    }
}