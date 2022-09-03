package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForWhoPage {

    private WebDriver driver;
    //Поле имя
    private By nameField;
    //Поле фамилия
    private By lastNameField;
    //Поле адрес
    private By addressField;
    //Поле номер телефона
    private By phoneField;
    //Поле станция метро
    private By stationField;
    //Кнопка "Далее"
    private By nextButton;


    public ForWhoPage(WebDriver driver) {
        this.driver = driver;
        this.nameField = By.xpath("//input[@placeholder = \'* Имя\']");
        this.lastNameField = By.xpath("//input[@placeholder = \'* Фамилия\']");
        this.addressField = By.xpath("//input[@placeholder = \'* Адрес: куда привезти заказ\']");
        this.phoneField = By.xpath("//input[@placeholder = \'* Телефон: на него позвонит курьер\']");
        this.stationField = By.xpath("//input[@placeholder= '* Станция метро']");
        this.nextButton = By.xpath("//button[text()= 'Далее']");
    }

    //Ввести имя в поле
    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    //Ввести фамилию в поле
    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    //Ввести адрес в поле
    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    //Выбор станции метро (клик по полю, вводим станцию, и снова клик по выбранной станции)
    public void choiceStation(String station) {
        driver.findElement(stationField).click();
        driver.findElement(By.xpath("//div[text()= '" + station + "']")).click();
    }

    //Ввести номер телефона в поле
    public void enterPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    //Нажать кнопку "Далее"
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }
}