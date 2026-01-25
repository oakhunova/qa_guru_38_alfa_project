package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка отображения логотипа 'А'")
    void mainPageShouldLoadAndDisplayLogo() {
        mainPage.openMainPage()
                .checkLogo();
    }

    @Test
    @DisplayName("Проверка отображения кнопки 'Войти'")
    void loginButtonShouldBeVisible() {
        mainPage.openMainPage()
                .checkLoginButton("Войти");
    }

    @Test
    @DisplayName("Проверка наличия поля поиска на странице")
    void searchInputFieldShouldBePresent() {
        mainPage.openMainPage()
                .clickSearchButton()
                .checkSearchInput();
    }

    @Test
    @DisplayName("Проверка работы поиска по сайту")
    void searchShouldReturnResults() {
        mainPage.openMainPage()
                .clickSearchButton()
                .searchFor("вклад")
                .checkResult("вклад");
    }

    @Test
    @DisplayName("Проверка наличия кнопки 'Получить карту'")
    void creditCardsSectionShouldOpenCorrectly() {
        mainPage.openMainPage()
                .clickCreditCardButton()
                .checkGetCardButton("Получить карту");
    }

    @Test
    @DisplayName("Проверка наличия кнопок 'Открыть ИП' и 'Открыть ООО'")
    void checkStartBusinessButtons() {
        mainPage.openMainPage()
                .clickSmeButton()
                .clickStartBusinessButton()
                .checkIpButton("Открыть ИП")
                .checkOooButton("Открыть ООО");
    }

    @Test
    @DisplayName("Проверка наличия кнопки 'Открыть счёт'")
    void checkOpenAccountButton() {
        mainPage.openMainPage()
                .clickCorporateButton()
                .checkOpenAccountButton("Открыть счёт");
    }

}
