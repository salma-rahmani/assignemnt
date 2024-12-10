package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    private final WebDriver driver;
    WebElement aboutElement;
    WebElement storeElement;
    WebElement gmailElement;
    WebElement commitmentElement;
    WebElement earbudsElement;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
        this.aboutElement = driver.findElement(By.xpath("//a [text() = 'About']"));
        this.storeElement = driver.findElement(By.xpath("//a [text() = 'Store']"));
        this.gmailElement = driver.findElement(By.xpath("//a [text() = 'Gmail']"));
        this.commitmentElement = driver.findElement(By.xpath("//a[@data-g-action = 'commitments']"));
        this.earbudsElement = driver.findElement(By.xpath("//a[text() = 'Earbuds']"));

    }

    public void clickOnAboutButton() {
        aboutElement.click();

    }
    public void clickOnCommitButton(){
        commitmentElement.click();
        String text = commitmentElement.getText();

    }

    public void clickOnStoreButton() {
        storeElement.click();

    }
    public void clickOnEarbudsButton(){
        earbudsElement.click();
        String text = earbudsElement.getText();
    }

    public void clickOnGmailButton() {
        gmailElement.click();
    }



}
