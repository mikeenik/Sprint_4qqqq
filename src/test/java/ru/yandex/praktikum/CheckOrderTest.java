package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

@RunWith(Parameterized.class)
public class CheckOrderTest extends BaseTest {
        private final String name;
        private final String lastName;
        private final String address;
        private final String station;
        private final String phone;
        private final String comment;

        public CheckOrderTest(String name, String lastName, String address, String station, String phone, String comment) {
            this.name = name;
            this.lastName = lastName;
            this.address = address;
            this.station = station;
            this.phone = phone;
            this.comment = comment;
        }

        // Тестовые данные
        @Parameterized.Parameters
        public static Object[][] getCredentials() {
            return new Object[][]{
                    {"Миша", "Еник", "Санкт-Петербург", "Университет", "+79217797100", "Все будет хорошо!"},
                    {"Брюс", "Уэйн", "Готэм", "Спортивная", "+77777777777", "Я - бэтман!"},
            };
        }

        @Test
        public void positiveOrderCaseUpperButton() {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                    wait.until(ExpectedConditions.elementToBeClickable( objMainPage.getUpperOrderButton())));
            objForWhoPage.enterName(name);
            objForWhoPage.enterLastName(lastName);
            objForWhoPage.enterAddress(address);
            objForWhoPage.choiceStation(station);
            objForWhoPage.enterPhone(phone);
            objForWhoPage.clickNextButton();
            objAboutRentPage.choiceDateDelivery();
            objAboutRentPage.choiceRentPeriod();
            objAboutRentPage.choiceBlackScooter();
            objAboutRentPage.enterCommentForCourier(comment);
            objAboutRentPage.clickOrderButton();
            objAboutRentPage.clickConfirmationOrderButton();
            //Тест падает, так как в хроме баг, добавил ожидания появление кнопки "Проверить статус"
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Посмотреть статус']"))));
        }

        @Test
        public void positiveOrderCaseLowerButton() {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                    wait.until(ExpectedConditions.elementToBeClickable( objMainPage.getLowerOrderButton())));
            objForWhoPage.enterName(name);
            objForWhoPage.enterLastName(lastName);
            objForWhoPage.enterAddress(address);
            objForWhoPage.choiceStation(station);
            objForWhoPage.enterPhone(phone);
            objForWhoPage.clickNextButton();
            objAboutRentPage.choiceDateDelivery();
            objAboutRentPage.choiceRentPeriod();
            objAboutRentPage.choiceBlackScooter();
            objAboutRentPage.enterCommentForCourier(comment);
            objAboutRentPage.clickOrderButton();
            objAboutRentPage.clickConfirmationOrderButton();
            //Тест падает, так как в хроме баг, добавил ожидания появление кнопки "Проверить статус"
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Посмотреть статус']"))));

        }
    }
