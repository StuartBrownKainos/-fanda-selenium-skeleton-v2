package uk.kainos.seleniumframework.site.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import uk.kainos.seleniumframework.site.Site;

public class KainosHomePage extends Site {

    private static final String PAGE_TITLE = "Home";

    @FindBy(id = "ccc-recommended-settings")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "/html/body/header/div/div/div[2]/div/ul/li[5]/div[1]/a")
    private WebElement clickCareersButton;

    @FindBy(id = "header") private WebElement pageHeader;

    public KainosHomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyPageHeader() {
        verifyPageTitle(pageHeader.getText(), PAGE_TITLE);
    }

    public KainosHomePage acceptCookies() {
        acceptCookiesButton.click();
        return this;
    }

    public KainosHomePage clickCareers(){
        clickCareersButton.click();
        return this;
    }
}
