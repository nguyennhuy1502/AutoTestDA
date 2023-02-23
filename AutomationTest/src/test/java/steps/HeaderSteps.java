package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import page.HeaderPage;

public class HeaderSteps {
    WebDriver driver;

    private HeaderPage headerPage = new HeaderPage(driver);
    @Given("I am go to page")
    public void iAmGoToPage() {
        driver = DriverFactory.getDriver();
    }


    @When("Click on Features redirect to the Features screen")
    public void clickOnFeaturesRedirectToTheScreen() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickOnFeatures();
    }

    @And("Click on the drop-down Ecosystem to display the list of values inside")
    public void clickOnTheDropDownEcosystemToDisplayTheListOfValuesInside() throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.dropdownEcosystem();
    }

    @And("Click drop-down Why Shopbase to display the list of values inside")
    public void clickDropDownWhyShopbaseToDisplayTheListOfValuesInside() throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.dropdownShopbase();
    }

    @And("Click on the text link Templates displays the Templates screen")
    public void clickOnTheTextLinkTemplatesDisplaysTheScreen() throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        Actions action = new Actions(driver);
        action.moveToElement(headerPage.templates()).build().perform();
        Thread.sleep(3000);
    }

    @And("Click on drop down Resources show list value in select box")
    public void clickOnDropDownResourcesShowListValueInSelectBox() throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.dropdownResources();
    }

    @And("Click on the Pricing")
    public void clickOnThePricing() throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickOnPricing();
        Thread.sleep(3000);
    }

    @Then("Click login button Redirect to login screen")
    public void clickLoginButtonRedirectToLoginScreen() throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickOnLogin();
        Thread.sleep(3000);
        driver.navigate().back();
    }
    @And("Click the Start 14-day free trial button goes to the Art your free 14-day trial of ShopBase screen")
    public void clickTheStartDayFreeTrialButtonGoesToTheArtYourFreeDayTrialOfShopBaseScreen() throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickOnBtnFreeTrial();
        Thread.sleep(3000);
    }
}
