package uk.kainos.seleniumframework.site.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import uk.kainos.seleniumframework.site.Site;

public class KainosCareerPage extends Site {

    private static final String PAGE_TITLE = "Careers";

    @FindBy(id = "ccc-recommended-settings")
    private WebElement acceptCookiesButton;

    @FindBy(id = "header") private WebElement pageHeader;

    public KainosCareerPage(WebDriver driver) {
        super(driver);
    }

    public void verifyPageHeader() {
        verifyPageTitle(pageHeader.getText(), PAGE_TITLE);
    }

    public KainosCareerPage acceptCookies() {
        acceptCookiesButton.click();
        return this;
    }
}
