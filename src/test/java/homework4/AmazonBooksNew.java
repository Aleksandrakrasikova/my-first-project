package homework4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonBooksNew {

    private final By ACCEPT_COOKIES = By.id("sp-cc-accept");
    private final By CONTINUE_BTN = By.xpath(".//input[@data-action-type = 'DISMISS']");

    private final By MENU_ITEMS = By.xpath(".//div[@id = 'nav-xshop/a']");


    private WebDriver browser;
    private WebDriverWait wait;


@Test
    public void OpeningAmazonHomePage (){

        String menuItemToSelect = "Best Sellers";

        System.setProperty("webdriver.chrome.driver", "/Users/aleksandrakrasikova/Desktop/chromedriver");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.amazon.de/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES));
        browser.findElement(ACCEPT_COOKIES).click();

        wait.until(ExpectedConditions.elementToBeClickable(CONTINUE_BTN));
        browser.findElement(CONTINUE_BTN).click();

        openMenuItem(menuItemToSelect);

    }
    private void openMenuItem (String itemName) {
        List<WebElement> menuItems = browser.findElements(MENU_ITEMS);
        for (WebElement we: menuItems) {
            if (we.getText().equals(itemName)) {
                we.click();
                break;
            }
        }
    }

}
