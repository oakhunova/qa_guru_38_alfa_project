package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка отображения логотипа 'А'")
    @Tag("alfamainpage")
    void mainPageShouldLoadAndDisplayLogo() {
        mainPage.openMainPage()
                .checkLogoOnPage();
    }

    @Test
    @DisplayName("Проверка отображения кнопки 'Войти'")
    @Tag("alfamainpage")
    void loginButtonShouldBeVisible() {
        mainPage.openMainPage()
                .checkLoginButtonOnPage();
    }

    @Test
    @DisplayName("Проверка наличия поля поиска на странице")
    @Tag("alfamainpage")
    void searchInputFieldShouldBePresent() {
        mainPage.openMainPage()
                .clickSearchButton()
                .checkSearchInputOnPage();
    }

    @Test
    @DisplayName("Проверка работы поиска по сайту")
    @Tag("alfamainpage")
    void searchShouldReturnResults() {
        mainPage.openMainPage()
                .clickSearchButton()
                .searchFor("вклад")
                .checkResult("вклад");
    }

    @Test
    @DisplayName("Проверка наличия кнопки 'Получить карту'")
    @Tag("alfamainpage")
    void creditCardsSectionShouldOpenCorrectly() {
        mainPage.openMainPage()
                .clickCreditCardButton()
                .checkGetCardButton();
    }
}
