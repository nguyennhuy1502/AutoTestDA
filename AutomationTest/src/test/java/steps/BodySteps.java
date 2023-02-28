package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import page.EmailPage;
import page.FeatureMobilePage;
import page.SlideHomePage;
import utils.CommonUtils;

public class BodySteps {

    WebDriver driver;

    private CommonUtils commonUtils;
    private SlideHomePage slideHomePage;
    private FeatureMobilePage featureMobilePage;
    private EmailPage emailPage;
    public void getDriver(){
        driver = DriverFactory.getDriver();
        commonUtils = new CommonUtils();
        slideHomePage = new SlideHomePage(driver);
        featureMobilePage = new FeatureMobilePage(driver);
        emailPage = new EmailPage(driver);
    }
    @When("Click Enter your email enter the correct gmail and click Start free trial")
    public void clickEnterYourEmailEnterTheCorrectGmailAndClickStartFreeTrial() throws InterruptedException {
        getDriver();
        emailPage.emailText().sendKeys(commonUtils.getEmailWithTimeStamp());
        emailPage.subscribe().click();
        Thread.sleep(3000);
        driver.navigate().back();
    }

    @And("Click Enter your email enter the missing email and press Start free trial")
    public void clickEnterYourEmailEnterTheMissingEmailAndPressStartFreeTrial() throws InterruptedException {
        emailPage.emailText().sendKeys(commonUtils.emailIsMissingTheFollowingPart());
        Thread.sleep(1000);
        emailPage.subscribe().click();
        emailPage.emailText().sendKeys(Keys.chord(Keys.CONTROL, "A"),Keys.BACK_SPACE);
        emailPage.emailText().sendKeys(commonUtils.emailIsMissingTheFollowingA());
        Thread.sleep(1000);
        emailPage.subscribe().click();
        emailPage.emailText().sendKeys(Keys.chord(Keys.CONTROL, "A"),Keys.BACK_SPACE);
        emailPage.emailText().sendKeys(commonUtils.emailWrongElementAfterA());
        Thread.sleep(1000);
        emailPage.subscribe().click();
        emailPage.titleCentre().isDisplayed();
        Thread.sleep(3000);
    }

    @And("Check out the slides")
    public void checkOutTheSlides() {
        getDriver();
        slideHomePage.slideHome().isDisplayed();
    }

    @And("Check the content below the slide")
    public void checkTheContentBelowTheSlide() {
        getDriver();
        featureMobilePage.featureWeb.isDisplayed();

    }

    @Then("Check get data item The Partner You Need To Build An Online Business That Thrives")
    public void checkGetDataItemThePartnerYouNeedToBuildAnOnlineBusinessThatThrives() {
        getDriver();
        featureMobilePage.
    }

    @And("Click {string}")
    public void clickStartDayFreeTrial(int arg0) {
    }

    @And("Click  Dropshipping Pop up a new tab")
    public void clickDropshippingPopUpANewTab() {
    }

    @And("Click  Print-on-demand Pop up a new tab")
    public void clickPrintOnDemandPopUpANewTab() {
    }

    @When("Check get data item Dropshipping")
    public void checkGetDataItemDropshipping() {
    }

    @Then("Click What is Dropshipping Text Link Click Test? Pop up a new tab")
    public void clickWhatIsDropshippingTextLinkClickTestPopUpANewTab() {
    }

    @And("Click Why ShopBase is the #1 platform for Dropshipping? Pop up a new tab")
    public void clickWhyShopBaseIsThePlatformForDropshippingPopUpANewTab(int arg0) {
    }

    @When("Check get data item {string}")
    public void checkGetDataItemPrintOnDemand() {
    }

    @And("Click Why ShopBase is the #{int} platform for POD? Pop up a new tab")
    public void clickWhyShopBaseIsThePlatformForPODPopUpANewTab(int arg0) {
    }

    @When("Check data Better Dropshipping, POD & White Label Services")
    public void checkDataBetterDropshippingPODWhiteLabelServices() {
    }

    @And("Check If {int}% Happiness Guarantee is displayed")
    public void checkIfHappinessGuaranteeIsDisplayed(int arg0) {
    }

    @And("Check Award-winning Support Team is displayed")
    public void checkAwardWinningSupportTeamIsDisplayed() {
    }

    @And("Check Start Anywhere - Sell Globally is displayed")
    public void checkStartAnywhereSellGloballyIsDisplayed() {
    }

    @And("Check Scale Your Business Easily is displayed")
    public void checkScaleYourBusinessEasilyIsDisplayed() {
    }

    @And("Check click button {string}")
    public void checkClickButtonGetStarted() {
    }
}
