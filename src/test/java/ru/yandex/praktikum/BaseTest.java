package ru.yandex.praktikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.AboutRentPage;
import pageobject.ForWhoPage;
import pageobject.MainPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;
    protected static MainPage objMainPage;
    protected static WebDriverWait wait;
    protected static ForWhoPage objForWhoPage;
    protected static AboutRentPage objAboutRentPage;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objMainPage = new MainPage(driver);
        objForWhoPage = new ForWhoPage(driver);
        objAboutRentPage = new AboutRentPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void clearData() {
        driver.manage().deleteAllCookies();
        ((WebStorage) driver).getLocalStorage().clear();
        ((WebStorage) driver).getSessionStorage().clear();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
