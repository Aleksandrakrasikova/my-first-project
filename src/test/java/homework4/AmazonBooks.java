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

public class AmazonBooks {

    private final By ACCEPT_COOKIES = By.id("sp-cc-accept");
    private final By CONTINUE_BTN = By.xpath(".//input[@data-action-type = 'DISMISS']");
    private final By MENU_ITEMS = By.xpath(".//div[@id = 'nav-xshop']/a");
    private final By ANY_DEPARTMENT = By.xpath(".//div[@role = 'group']/div/a");
    private final By BOOK_LIST = By.xpath(".//div[@class = 'a-icon-row']/a");
    private final By RATING_LIST = By.xpath(".//span[@class = 'a-size-small']");
    private final By STARS_RATING = By.xpath(".//span[@class = 'a-icon-alt']");
    private final By REVIEWS = By.xpath(".//div[@data-hook = 'review']");
    private final By VIEW = By.xpath("//a[@data-hook ='review-title']");
    private final By NEXT_PAGE_BTN = By.xpath(".//div[@id = 'cm_cr-pagination_bar']/ul/li[2]/a");


    private WebDriver browser;
    private WebDriverWait wait;

    @Test

    public void OpenAmazonPage() {
        String books = "books";
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
        ClickOnBooks(books);
        ClickOn4thBookRating();

        }

    private void openMenuItem(String itemName) {
        List<WebElement> menuItems = browser.findElements(MENU_ITEMS);
        for (WebElement we: menuItems) {
            if (we.getText().equals(itemName)) {
                we.click();
                break;
            }
        }
    }

        public void ClickOnBooks(String books) {
        List<WebElement> listOfDepartment = browser.findElements(ANY_DEPARTMENT);
            for (WebElement element : listOfDepartment) {
                if (element.getText().equals("Books")) {
                element.click();
                    break;
            }
        }
    }
        public void ClickOn4thBookRating () {
          List<WebElement> listOfBooks = browser.findElements(RATING_LIST);
          listOfBooks.get(3).click();

            List<WebElement> listOfDepartment = browser.findElements(RATING_LIST);
            WebElement e = listOfDepartment.get(3);
            String text = e.getAttribute("innerHTML");
            System.out.println("4th book total rating " + text);

            List<WebElement> listOfStars = browser.findElements(STARS_RATING);
            WebElement s = listOfStars.get(3);
            String text2 = s.getAttribute("innerHTML");
            System.out.println("4th book rating " + text2);
        }
}








