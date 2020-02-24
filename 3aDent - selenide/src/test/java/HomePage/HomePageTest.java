package HomePage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.*;
import org.openqa.selenium.WebElement;

import static Google.Google.*;
import static HomePage.HomePage.*;
import static HomePage.HomePage.HomePage;
import static Registration.OnlineRegistrationPage.OnlineRegistrationButton;
import static Registration.OnlineRegistrationPage.OnlineRegistrationButton2;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.xpath;



public class HomePageTest {

    @Before
    public void setUp() {
       System.setProperty("webdriver.chrome.driver", "C:/Program Files/JetBrains/chromedriver.exe");
        Configuration.browser="chrome";
        Configuration.startMaximized=true;
        Configuration.pageLoadStrategy="normal";
       // Configuration.browserSize="1600x900";
        Configuration.holdBrowserOpen = true;
        open("https://www.3-adent.com.ua");

    }
        @After
                public void TearDown(){
            System.out.println("I am going to be launched after every test");
    }
    @BeforeClass
    public static void setUpAll() {
        System.out.println("I am going to be launched before this one Class. But I should be a static");

    }
    @AfterClass
    public static void TearDownAll(){
        System.out.println("I am going to be launched after this one class. But I should be a static");

    }
    @Rule
    public ScreenShooter photographer = ScreenShooter.failedTests().succeededTests();



@Test
    public void GoogleFind(WebElement FirstValue) {
        GooglePage();
        FillInGoogleSearch("3adent");
        FindButton().click();
        FirstValueURL().getText().equals(FirstValue);
        FirstLink().click();
    }
    @Test
    public void menuExists() {
        //Here we assert that all the pages of menu exists
        HomePage();
        ProfessionalHygieneButton().isDisplayed();
        CariesTreatmentButton().isDisplayed();
        ToothCanalTreatmentButton().isDisplayed();
        PeriodontologyButton().isDisplayed();
        AdultSurgeryButton().isDisplayed();
        ImplantationButton().isDisplayed();
        OrthodonticsButton().isDisplayed();
        ChildSurgeryButton().isDisplayed();
        ProstheticsButton().isDisplayed();
        ChildSurveyButton().isDisplayed();
    }
    @Test
    public void PassToRegistration() {
        //I am on the main 3aDent Page
        //We are going to get to the page of an online registration to the Doctor

        HomePage();
        OnlineRegistrationButton().click();
        OnlineRegistrationButton2().click();
    }

    @Test
    public void PassToHygiene() {
        ProfessionalHygieneButton().click();
    }
    @Test
    public void PassToCariesTreatment() {
        CariesTreatmentButton().click();
        $(xpath("//div[@id='wrapper']/p[3]")).shouldBe(value("В залежності від об’єму втрачених тканин та функцій зуба"+
                "використовуються фотокомпозити фірм 3M ESPE (США), Gradia Direct (Японія), Sigma (Японія),"+
                "Asteria (Японія)."));
    }

    @Test
    public void PassToCanalTreatment() {
        ToothCanalTreatmentButton().click();
        $(xpath("[@id='wrapper']/p[2]")).shouldBe(value("Процес лікування кореневих каналів ділиться на механічну,"+
                "інструментальну та медикаментозну обробку."));
    }
    @Test
    public void PassToPeriodontology() {
        PeriodontologyButton().click();
        //Text to be expected
    }
    @Test
    public void PassToAdultSurgery() {
        AdultSurgeryButton().click();
        //Text to be expected
    }
    @Test
    public void PassToImplantation() {
        ImplantationButton().click();
        //Text to be expected
    }
    @Test
    public void PassToOrthodontics() {
        OrthodonticsButton().click();
        //Text to be expected
    }
    @Test
    public void ChildSurgery() {
        ChildSurgeryButton().click();
        //Text to be expected
    }
    @Test
    public void PassToProstheticsPage() {
        ProstheticsButton().click();
        //Text to be expected
    }
    @Test
    public void PassToChildSurveyPage() {
        ChildSurveyButton().click();
        //Text to be expected
    }
}