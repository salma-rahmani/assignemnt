package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    private final WebDriver driver;
    WebElement aboutElement;
    WebElement storeElement;
    WebElement gmailElement;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        this.aboutElement = driver.findElement(By.xpath("//a [text() = 'About']"));
        this.storeElement = driver.findElement(By.xpath("//a [text() = 'Store']"));
        this.gmailElement = driver.findElement(By.xpath("//a [text() = 'Gmail']"));
    }

    public void clickOnAboutButton() {
        aboutElement.click();

    }

    public void clickOnStoreButton() {
        storeElement.click();

    }

    public void clickOnGmailButton() {
        gmailElement.click();
    }


}
