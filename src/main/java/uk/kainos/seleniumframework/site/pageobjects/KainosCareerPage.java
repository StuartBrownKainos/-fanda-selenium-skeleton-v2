package uk.kainos.seleniumframework.site.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import uk.kainos.seleniumframework.site.Site;

import java.net.URL;

public class KainosCareerPage extends Site {

    private static final String PAGE_TITLE = "Building a better\n" +
            "world begins with you";


    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/div[2]/button/ppc-content")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/section[4]/div/div/div/div/div/div/div/ppc-container[1]/h1/ppc-content") private WebElement pageHeader;

    public KainosCareerPage(WebDriver driver) {
        super(driver);
    }
    public KainosCareerPage acceptCookies() {
        acceptCookiesButton.click();
        return this;
    }
    public void verifyPageHeader() {
        verifyPageTitle(pageHeader.getText(), PAGE_TITLE);
    }



}
