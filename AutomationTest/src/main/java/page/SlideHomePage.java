package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class SlideHomePage {
    WebDriver driver;
    private ElementUtils elementUtils;

    public SlideHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    public WebElement slideMask(){
        return driver.findElement(By.xpath("//div[contains(@id, 'w-slider-mask-2')]"));
    }

    public WebElement slideHome(){
        return driver.findElement(By.xpath("//div[contains(@class,'slide-home w')]"));
    }

    public WebElement slideHome2(){
        return driver.findElement(By.xpath("//div[contains(@class,'slide-home _2')]"));
    }

    public WebElement slideHome3(){
        return driver.findElement(By.xpath("//div[contains(@class,'slide-home _3')]"));
    }
}
