package homework4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonBooks {

    private final By ACCEPT_COOKIES = By.id("sp-cc-accept");
    private final By BEST_SELLERS = By.xpath(".//a[@data-csa-c-slot-id = 'nav_cs_0']");
    private final By ANY_DEPARTMENT = By.xpath(".//div[@role = 'group']/div/a");
    private final By BOOK_LIST = By.id("gridItemRoot");


    private WebDriver browser;

    @Test

    public void OpenAmazonPage(){

        System.setProperty("webdriver.chrome.driver", "/Users/aleksandrakrasikova/Downloads/chromedriver");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.amazon.de/");

        browser.findElement(ACCEPT_COOKIES).click();

        browser.findElement(BEST_SELLERS).click();

        List<WebElement>listOfDepartment = browser.findElements(ANY_DEPARTMENT);
        for (WebElement element : listOfDepartment) {
            if (element.getText().equals("Books")) {
                element.click();
            }
            }


        List<WebElement>listOfBooks = browser.findElements(BOOK_LIST);
        for (WebElement book : listOfBooks) {
            System.out.println(book);
        }

        }
}






