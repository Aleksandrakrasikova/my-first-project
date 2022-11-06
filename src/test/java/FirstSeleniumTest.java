import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FirstSeleniumTest {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");


    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver", "/Users/aleksandrakrasikova/Downloads/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();


        List<WebElement> listOfCountries = browser.findElements(By.xpath(".//div[@class = 'tl-box']/a"));
        for (WebElement element : listOfCountries) {
            if (element.getText().equals("Latvia")) {
                element.click();
                String elementName= browser.findElement(By.xpath(".//div[@class = 'col-12']/h1")).getText();
                  if (elementName.equals("Car Rental in Latvia")){
                      System.out.println("true");
                      return;
                  }
            }
        }
    }
}

    /*        browser.findElement(By.linkText("Latvia")).click();
     *//*        String lat = "Car Rental in Latvia";
        browser.findElement(By.xpath(".//div[@class = 'col-12']/h1")).getText();
        if (browser.getPageSource().contains("Latvia")) {
            System.out.println("Word: " + lat + "is present.");
        } else {
            System.out.println("Word: " + lat + "is not present.");
        }*/




