package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutRentPage {

    private WebDriver driver;
    //Поле "Когда привезти самокат"
    private By whenScooterDeliveryField;
    //Поле "Срок аренды"
    private By rentPeriodField;
    //Черный цвет самоката
    private By blackScooter;
    //Серый цвет самоката
    private By greyScooter;
    //Поле "Комментарий для курьера"
    private By commentForCourierField;
    //Кнопка заказать
    private By orderButton;
    //Кнопка подтверждения
    private By confirmationOrderButton;

    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
        this.whenScooterDeliveryField = By.xpath("//input[@placeholder = '* Когда привезти самокат']");
        this.rentPeriodField = By.xpath("//div[@class = 'Dropdown-control']");
        this.blackScooter = By.id("black");
        this.greyScooter = By.id("grey");
        this.commentForCourierField = By.xpath("//input[@placeholder = 'Комментарий для курьера']");
        this.orderButton = By.xpath("//div/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
        this.confirmationOrderButton = By.xpath("//button[text()='Да']");
    }

    public void choiceDateDelivery() {
        driver.findElement(whenScooterDeliveryField).click();
        driver.findElement(By.xpath("//div[@aria-label = 'Choose воскресенье, 25-е сентября 2022 г.']")).click();
    }

    public void choiceRentPeriod() {
        driver.findElement(rentPeriodField).click();
        driver.findElement(By.xpath("//div[text()= 'трое суток']")).click();
    }

    public void choiceBlackScooter() {
        driver.findElement(blackScooter).click();
    }

    public void choiceGreyScooter() {
        driver.findElement(greyScooter).click();
    }

    public void enterCommentForCourier(String comment) {
        driver.findElement(commentForCourierField).sendKeys(comment);
    }

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void clickConfirmationOrderButton() {
        driver.findElement(confirmationOrderButton).click();
    }
}