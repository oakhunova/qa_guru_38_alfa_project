package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CheckResultComponent;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement logo = $("a[title='alfaIcon']");
    private final SelenideElement loginButton = $("button[data-widget-name='AnalyticsEventSender']");
    private final SelenideElement searchButton = $("[data-test-id='test-ya-button']");
    private final SelenideElement searchInput = $("[data-test-id='search-input']");
    private final SelenideElement creditCardButton = $("a[href*='credit-cards/zayavka']:first-of-type");
    private final SelenideElement getCardButton = $("[data-test-id='MainBanner-button-get-card']");

    CheckResultComponent checkResultComponent = new CheckResultComponent();

    @Step("Открытие сайта в браузере")
    public MainPage openMainPage() {
        open("");
        return this;
    }

    @Step("Проверка отображения логотипа 'А'")
    public MainPage checkLogo() {
        logo.shouldBe(visible);
        return this;
    }

    @Step("Проверка отображения кнопки 'Войти'")
    public MainPage checkLoginButton(String loginButtonName) {
        loginButton.shouldHave(text(loginButtonName))
                .shouldBe(visible);
        return this;
    }

    @Step("Нажатие кнопки поиска 'Лупа'")
    public MainPage clickSearchButton() {
        searchButton.click();
        return this;
    }

    @Step("Осуществление поиска по слову")
    public MainPage searchFor(String query) {
        searchInput.shouldBe(visible);
        searchInput.setValue(query).pressEnter();
        return this;
    }

    @Step("Проверка найденных результатов поиска")
    public MainPage checkResult(String value) {
        checkResultComponent.checkResult(value);
        return this;
    }

    @Step("Нажатие на виджет 'Кредитная карта'")
    public MainPage clickCreditCardButton() {
        creditCardButton.click();
        return this;
    }

    @Step("Проверка отображения кнопки 'Получить карту'")
    public MainPage checkGetCardButton(String getCardButtonName) {
        getCardButton.shouldBe(visible).shouldHave(text(getCardButtonName));
        return this;
    }

}
