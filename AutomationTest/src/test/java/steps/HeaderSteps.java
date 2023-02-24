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

    @Given("I am go to page")
    public void iAmGoToPage() {
        driver = DriverFactory.getDriver();
    }


    @When("Click on {string} redirect to the Features screen")
    public void clickOnFeaturesRedirectToTheScreen(String name) {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.nameHeader(name).click();
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
        headerPage.templates().click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @And("Click on drop down Resources show list value in select box")
    public void clickOnDropDownResourcesShowListValueInSelectBox() throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.dropdownResources();
    }

    @And("Click on the {string}")
    public void clickOnThePricing(String name) throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.nameHeader(name).click();
        Thread.sleep(3000);
    }

    @Then("Click {string} button Redirect to login screen")
    public void clickLoginButtonRedirectToLoginScreen(String name) throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.nameHeader(name).click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
    @And("Click the {string} button goes to the Art your free 14-day trial of ShopBase screen")
    public void clickTheStartDayFreeTrialButtonGoesToTheArtYourFreeDayTrialOfShopBaseScreen(String name) throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.nameHeader(name).click();
        Thread.sleep(3000);
    }
}
