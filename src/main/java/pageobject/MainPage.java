package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage {


    private WebDriver driver;
    //собрал все ответы в массив
    private List<WebElement> answers;
    //собрал все вопросы в массив
    private List<WebElement> questions;
    //Верхняя кнопка "Заказать"
    private WebElement upperOrderButton;
    //Нижняя кнопка "Заказать"
    private WebElement lowerOrderButton;
public MainPage(WebDriver driver) {
        this.driver = driver;
        this.questions = driver.findElements(By.xpath("//div[@class = 'accordion__button']"));
        this.answers = driver.findElements(By.xpath("//div[@class = 'accordion__panel']"));
        this.upperOrderButton = driver.findElement(By.xpath("//button[@class = 'Button_Button__ra12g']"));
        this.lowerOrderButton = driver.findElement(By.xpath("(//button[.='Заказать'])[2]"));
    }

    public List<WebElement> getQuestions() {
        return questions;
    }
    public List<WebElement> getAnswers() {
        return answers;
    }

    public WebElement getUpperOrderButton() {
        return upperOrderButton;
    }

    public WebElement getLowerOrderButton() {
        return lowerOrderButton;
    }
}