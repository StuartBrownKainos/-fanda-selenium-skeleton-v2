package uk.kainos.seleniumframework.site.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import uk.kainos.seleniumframework.site.Site;
public class kainosEngineeringRoles extends Site {
    public kainosEngineeringRoles(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/div[2]/section[2]/div/div/div/div[1]/div[1]/div[1]/h2/span[1]/ppc-content")
    private WebElement searchResults;

    public kainosEngineeringRoles verifySearch(){
    searchResults.getText();
    return this;
    }
}
