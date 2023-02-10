package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import uk.kainos.seleniumframework.driver.DriverManager;

import uk.kainos.seleniumframework.site.pageobjects.KainosCareerPage;
import uk.kainos.seleniumframework.site.pageobjects.KainosHomePage;
import uk.kainos.seleniumframework.site.pageobjects.kainosEngineeringRoles;

public class KainosCareerPageStepDefinitions {
    private final String KAINOS_HOME_PAGE = "https://www.kainos.com/";
    protected WebDriver driver = DriverManager.getDriver();

    @Given("^the user is on Kainos home page$")
    public KainosCareerPageStepDefinitions theClientOpenKainosHomePage() {
        driver.navigate().to(KAINOS_HOME_PAGE);
        KainosHomePage kainosHomePage= new KainosHomePage(driver);
        kainosHomePage.acceptCookies();
        return this;
    }
    @When("the user navigates to the Careers page")
    public KainosCareerPageStepDefinitions theClientOpenKainosCareerPage() {
        driver.navigate().to(KAINOS_HOME_PAGE);
        KainosHomePage kainosHomePage= new KainosHomePage(driver);
        kainosHomePage.clickCareers();
        return this;
    }
    @Then("^the user should see the careers page$")
    public KainosCareerPageStepDefinitions theClientisOnTheKainosCareersPage() {
        KainosCareerPage kainosCareerPage = new KainosCareerPage(driver);
        kainosCareerPage.acceptCookies();
        return this;
    }
    @Given("^the user is on the Careers page$")
    public KainosCareerPageStepDefinitions theClientisOnTheKainosCareersPageforSearching() {
        String KAINOS_CAREERS_PAGE = "https://careers.kainos.com/gb/en";
        driver.navigate().to(KAINOS_CAREERS_PAGE);
        KainosCareerPage kainosCareerPage = new KainosCareerPage(driver);
        kainosCareerPage.acceptCookies();
        return this;
    }
    @When("^the user navigates to the the opportunities related to test$")
    public KainosCareerPageStepDefinitions theClientisNavigatestoEngineering() {
        KainosCareerPage kainosCareerPage = new KainosCareerPage(driver);
       kainosCareerPage.searchTest();
        return this;
    }


    @Then("the user can see all results relating to test")
    public KainosCareerPageStepDefinitions theClientSeesSearchResults(){
        kainosEngineeringRoles kainosEngineeringRoles = new kainosEngineeringRoles(driver);
        kainosEngineeringRoles.verifySearch();
        return this;
    }


}
