import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TicketsTests {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[contains(text(),'Get Price')]");
    private final By BOOK_BTN = By.id("book2");
    private final By SEATS = By.xpath(".//div[@class = 'seat']");
    private final By BOOK_ALL_RESERVATION_BTN = By.id("book3");


    private final By RESERVATION_PAGE_AIRPORT = By.xpath(".//span[@class = 'bTxt']");



    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void reservationCheck() {
        System.setProperty("webdriver.chrome.driver", "/Users/aleksandrakrasikova/Downloads/chromedriver");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        select(FROM, "RIX");
        select(TO, "MEL");

        browser.findElement(GO_BTN).click();

        String CHECK =  browser.findElement(RESERVATION_PAGE_AIRPORT).getText();
        Assertions.assertEquals(CHECK, FROM, "Error");



        type(FIRST_NAME, "Aleksandra");
        type(LAST_NAME, "Krasikova");
        type(DISCOUNT, "Discount Code");
        type(ADULTS, "2");
        type(CHILDREN, "2");
        type(BAG, "4");
        select(FLIGHT, "15");

       /* browser.findElement(GET_PRICE_BTN).click();

        browser.findElement(BOOK_BTN).click();

        SelectSeat();

        browser.findElement(BOOK_ALL_RESERVATION_BTN).click();*/
    }

        //Assertions.assertEquals(homePageAirport, reservationPageAirport, "Wrong Airport");

        /*Select airportFrom = new Select(browser.findElement(FROM));
        airportFrom.selectByValue("RIX");

        Select airportTo = new Select(browser.findElement(TO));
        airportTo.selectByValue("MEL");*/

        /*browser.findElement(FIRST_NAME).clear();
        browser.findElement(FIRST_NAME).sendKeys("First Name");

        browser.findElement(LAST_NAME).clear();
        browser.findElement(LAST_NAME).sendKeys("Last Name");*/

    private void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    private void type (By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }
    public void SelectSeat () {
        List<WebElement> listOfSeats = browser.findElements(SEATS);
        listOfSeats.get(10).click();
    }
    public void CheckAirports () {
        List<WebElement> listOfAirports = browser.findElements(RESERVATION_PAGE_AIRPORT);
        listOfAirports.get(0);
    }


    @AfterEach
    public void closeBrowser() {
        browser.close();
    }
}

