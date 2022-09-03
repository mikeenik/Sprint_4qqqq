package ru.yandex.praktikum;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;
import static ru.yandex.praktikum.TestData.*;


public class CheckImportantQuestionsTest extends BaseTest {

    @Test
    public void firstAnswersShouldBeDisplayed() {

        var question = objMainPage.getQuestions().get(0);
        var answer = objMainPage.getAnswers().get(0);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                wait.until(ExpectedConditions.elementToBeClickable(question)));

        wait.until(ExpectedConditions.visibilityOf(answer));

        String actualTextFirstElement = answer.getText();
        assertEquals(EXPECTED_TEXT_FIRST_ELEMENT, actualTextFirstElement);
    }

    @Test
    public void secondAnswersShouldBeDisplayed() {

        var question = objMainPage.getQuestions().get(1);
        var answer = objMainPage.getAnswers().get(1);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                wait.until(ExpectedConditions.elementToBeClickable(question)));

        wait.until(ExpectedConditions.visibilityOf(answer));

        String actualTextFirstElement = answer.getText();
        assertEquals(EXPECTED_TEXT_SECOND_ELEMENT, actualTextFirstElement);
    }

    @Test
    public void thirdAnswersShouldBeDisplayed() {

        var question = objMainPage.getQuestions().get(2);
        var answer = objMainPage.getAnswers().get(2);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                wait.until(ExpectedConditions.elementToBeClickable(question)));

        wait.until(ExpectedConditions.visibilityOf(answer));

        String actualTextFirstElement = answer.getText();
        assertEquals(EXPECTED_TEXT_THIRD_ELEMENT, actualTextFirstElement);
    }

    @Test
    public void fourthAnswersShouldBeDisplayed() {

        var question = objMainPage.getQuestions().get(3);
        var answer = objMainPage.getAnswers().get(3);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                wait.until(ExpectedConditions.elementToBeClickable(question)));

        wait.until(ExpectedConditions.visibilityOf(answer));

        String actualTextFirstElement = answer.getText();
        assertEquals(EXPECTED_TEXT_FOURTH_ELEMENT, actualTextFirstElement);
    }

    @Test
    public void fifthAnswersShouldBeDisplayed() {

        var question = objMainPage.getQuestions().get(4);
        var answer = objMainPage.getAnswers().get(4);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                wait.until(ExpectedConditions.elementToBeClickable(question)));

        wait.until(ExpectedConditions.visibilityOf(answer));

        String actualTextFirstElement = answer.getText();
        assertEquals(EXPECTED_TEXT_FIFTH_ELEMENT, actualTextFirstElement);
    }

    @Test
    public void sixthAnswersShouldBeDisplayed() {

        var question = objMainPage.getQuestions().get(5);
        var answer = objMainPage.getAnswers().get(5);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                wait.until(ExpectedConditions.elementToBeClickable(question)));

        wait.until(ExpectedConditions.visibilityOf(answer));

        String actualTextFirstElement = answer.getText();
        assertEquals(EXPECTED_TEXT_SIXTH_ELEMENT, actualTextFirstElement);
    }

    @Test
    public void seventhAnswersShouldBeDisplayed() {

        var question = objMainPage.getQuestions().get(6);
        var answer = objMainPage.getAnswers().get(6);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                wait.until(ExpectedConditions.elementToBeClickable(question)));

        wait.until(ExpectedConditions.visibilityOf(answer));

        String actualTextFirstElement = answer.getText();
        assertEquals(EXPECTED_TEXT_SEVENTH_ELEMENT, actualTextFirstElement);
    }

    @Test
    public void eighthAnswersShouldBeDisplayed() {

        var question = objMainPage.getQuestions().get(7);
        var answer = objMainPage.getAnswers().get(7);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                wait.until(ExpectedConditions.elementToBeClickable(question)));

        wait.until(ExpectedConditions.visibilityOf(answer));

        String actualTextFirstElement = answer.getText();
        assertEquals(EXPECTED_TEXT_EIGHTH_ELEMENT, actualTextFirstElement);
    }
}