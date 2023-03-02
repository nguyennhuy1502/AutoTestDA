package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import page.*;
import utils.CommonUtils;

public class BodySteps {

    WebDriver driver;

    private CommonUtils commonUtils;
    private SlideHomePage slideHomePage;
    private FeaturePage featurePage;
    private EmailPage emailPage;
    private DropShippingPage dropShippingPage;
    private PrintOnDemand printOnDemand;

    public void getDriver() throws InterruptedException {
        driver = DriverFactory.getDriver();
        commonUtils = new CommonUtils();
        slideHomePage = new SlideHomePage(driver);
        featurePage = new FeaturePage(driver);
        emailPage = new EmailPage(driver);
        dropShippingPage = new DropShippingPage(driver);
        printOnDemand = new PrintOnDemand(driver);
        Thread.sleep(2000);
    }

    @When("Click Enter your email enter the correct gmail and click Start free trial")
    public void clickEnterYourEmailEnterTheCorrectGmailAndClickStartFreeTrial() throws InterruptedException {
        getDriver();
        emailPage.emailText().sendKeys(commonUtils.getEmailWithTimeStamp());
        emailPage.subscribe().click();
        Thread.sleep(1000);
        driver.navigate().back();
    }

    @And("Click Enter your email enter the missing email and press Start free trial")
    public void clickEnterYourEmailEnterTheMissingEmailAndPressStartFreeTrial() throws InterruptedException {
        emailPage.emailText().sendKeys(commonUtils.emailIsMissingTheFollowingPart());
        Thread.sleep(1000);
        emailPage.subscribe().click();
        emailPage.emailText().sendKeys(Keys.chord(Keys.CONTROL, "A"), Keys.BACK_SPACE);
        emailPage.emailText().sendKeys(commonUtils.emailIsMissingTheFollowingA());
        Thread.sleep(1000);
        emailPage.subscribe().click();
        emailPage.emailText().sendKeys(Keys.chord(Keys.CONTROL, "A"), Keys.BACK_SPACE);
        emailPage.emailText().sendKeys(commonUtils.emailWrongElementAfterA());
        Thread.sleep(1000);
        emailPage.subscribe().click();
        emailPage.titleCentre().isDisplayed();
    }

    @And("Check out the slides")
    public void checkOutTheSlides() throws InterruptedException {
        getDriver();
        slideHomePage.slideHome().isDisplayed();
    }

    @And("Check the content below the slide")
    public void checkTheContentBelowTheSlide() throws InterruptedException {
        getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", featurePage.linkText);
        if (featurePage.featureWeb.isDisplayed()) {
            featurePage.contentTitleHome.isDisplayed();
            featurePage.contentHome.isDisplayed();
            featurePage.linkText.isDisplayed();
        }
    }

    @Then("Check get data item The Partner You Need To Build An Online Business That Thrives")
    public void checkGetDataItemThePartnerYouNeedToBuildAnOnlineBusinessThatThrives() throws InterruptedException {
        getDriver();
        Actions action = new Actions(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", featurePage.linkText);
        featurePage.blockTextHighConversion.isDisplayed();
        featurePage.contentHome.isDisplayed();
        featurePage.headingText("High Conversion").isDisplayed();
        featurePage.content("We pre-made").isDisplayed();
        featurePage.checkLink("Dropshipping").isDisplayed();
        action.moveToElement(featurePage.checkLink("Dropshipping")).build().perform();
        featurePage.checkLink("Print-on-demand").isDisplayed();
        action.moveToElement(featurePage.checkLink("Print-on-demand")).build().perform();
        featurePage.imageScrollHighConversion.isDisplayed();

        js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", featurePage.headingText("Built-in Tools"));
        featurePage.headingText("Built-in Tools").isDisplayed();
        featurePage.content("Empower your eCommerce business").isDisplayed();
        featurePage.imageScrollBuiltIn.isDisplayed();

        js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", featurePage.headingText("Trending Product"));
        featurePage.headingText("Trending Product").isDisplayed();
        featurePage.content("ShopBase takes care").isDisplayed();
        featurePage.imageTrendingProduct.isDisplayed();

        js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", featurePage.headingText("Various Payment"));
        featurePage.headingText("Various Payment").isDisplayed();
        featurePage.content("ShopBase provides").isDisplayed();
        featurePage.imageVariousPayment.isDisplayed();

    }

    @And("Click Start 14-day free trial")
    public void clickStartDayFreeTrial() throws InterruptedException {
        getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", featurePage.linkText);
        featurePage.linkText.click();
        driver.navigate().back();
    }

    @And("Click  Dropshipping Pop up a new tab")
    public void clickDropshippingPopUpANewTab() throws InterruptedException {
        getDriver();
        featurePage.checkLink("Dropshipping").click();
        Thread.sleep(1000);
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow);
    }

    @And("Click  Print-on-demand Pop up a new tab")
    public void clickPrintOnDemandPopUpANewTab() throws InterruptedException {
        getDriver();
        featurePage.checkLink("Print-on-demand").click();
        Thread.sleep(1000);
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow);
    }

    @When("Check get data item Dropshipping")
    public void checkGetDataItemDropshipping() throws InterruptedException {
        getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", dropShippingPage.dropShipping);
        try {
            if (dropShippingPage.dropShipping.isDisplayed()) {
                dropShippingPage.contentImg.isDisplayed();
                dropShippingPage.contentDropShipping.isDisplayed();
                dropShippingPage.contentDropShippingHeader.isDisplayed();
                dropShippingPage.contentDropShippingPa.isDisplayed();
                dropShippingPage.contentSmallDetail("Create a fully functional").isDisplayed();
                dropShippingPage.contentSmallDetail("Automatically optimize").isDisplayed();
                dropShippingPage.contentSmallDetail("Source products & fulfill").isDisplayed();
                js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", dropShippingPage.getContentDropShippingBusiness);
                dropShippingPage.getContentDropShippingBusiness.isDisplayed();
                dropShippingPage.linkText("What is Dropshipping?").isDisplayed();
                dropShippingPage.linkText("Why ShopBase is the #1 platform for Dropshipping?").isDisplayed();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Click What is Dropshipping Text Link Click Test? Pop up a new tab")
    public void clickWhatIsDropshippingTextLinkClickTestPopUpANewTab() throws InterruptedException {
        getDriver();
        dropShippingPage.linkText("What is Dropshipping?").click();
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow);
    }

    @And("Click Why ShopBase is the #1 platform for Dropshipping? Pop up a new tab")
    public void clickWhyShopBaseIsThePlatformForDropshippingPopUpANewTab() {
        dropShippingPage.linkText("Why ShopBase is the #1 platform for Dropshipping?").click();
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow);
    }

    @When("Check get data item Print On Demand")
    public void checkGetDataItemPrintOnDemand() throws InterruptedException {
        getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", printOnDemand.detailFeaturePOD);
        printOnDemand.printOnDemand.isDisplayed();
        printOnDemand.detailFeaturePOD.isDisplayed();
        dropShippingPage.contentSmallDetail("Create a fully-functioning").isDisplayed();
        dropShippingPage.contentSmallDetail("Enjoy premium printing & fulfillment services.");
        dropShippingPage.contentSmallDetail("Be free from dealing").isDisplayed();
        dropShippingPage.linkText("Why ShopBase is the #1 platform for POD?").isDisplayed();
        printOnDemand.imagePOD.isDisplayed();
        printOnDemand.linkText.isDisplayed();
    }

    @And("Click Why ShopBase is the #1 platform for POD? Pop up a new tab")
    public void clickWhyShopBaseIsThePlatformForPODPopUpANewTab() throws InterruptedException {
        getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView('{behavior: \"smooth\", block: \"nearest\", inline: \"nearest\"}');", printOnDemand.linkText);
        printOnDemand.linkText.click();
        driver.navigate().back();
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

    @When("Check get data item Empowering ECommerce Businesses Around The World To Succeed")
    public void checkGetDataItemEmpoweringECommerceBusinessesAroundTheWorldToSucceed() {

    }

    @And("Check click button Get Started")
    public void checkClickButtonGetStarted() {
    }
}
