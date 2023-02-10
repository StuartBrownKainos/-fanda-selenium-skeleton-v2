package uk.kainos.seleniumframework.site.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.kainos.seleniumframework.site.Site;


public class KainosCareerPage extends Site {

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/div[2]/button/ppc-content")
    private WebElement acceptCookiesButton;



    @FindBy(id = "ph-search-backdrop") private WebElement buttonSearch;
    public KainosCareerPage(WebDriver driver) {
        super(driver);
    }
    public KainosCareerPage acceptCookies() {
        acceptCookiesButton.click();

        return this;
    }

    public KainosCareerPage searchTest(){
        new WebDriverWait(driver, 10000).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/section[4]/div/div/div/div/div/div/div/section/div/form/div[2]/div/div/div[1]/input")));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[4]/div/div/div/div/div/div/div/section/div/form/div[2]/div/div/div[1]/input"))
                .sendKeys("Test");
        buttonSearch.click();
        return this;
    }

}
