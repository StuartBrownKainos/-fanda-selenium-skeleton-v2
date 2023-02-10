package uk.kainos.seleniumframework.site.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import uk.kainos.seleniumframework.site.Site;

public class KainosHomePage extends Site {
    @FindBy(id = "ccc-recommended-settings")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "/html/body/header/div/div/div[2]/div/ul/li[5]/div[1]/a")
    private WebElement clickCareersButton;

    public KainosHomePage(WebDriver driver) {
        super(driver);
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
