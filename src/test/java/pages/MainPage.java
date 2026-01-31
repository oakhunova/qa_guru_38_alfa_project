package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.components.CheckResultComponent;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement logo = $("a[title='alfaIcon']");
    private final SelenideElement loginButton =  $("button[data-widget-name='AnalyticsEventSender']");
    private final SelenideElement searchButton = $("[data-test-id='test-ya-button']");
    private final SelenideElement searchInput = $("[data-test-id='search-input']");
    private final SelenideElement creditCardButton = $("a[href*='credit-cards/zayavka']:first-of-type");
    private final SelenideElement getCardButton = $("[data-test-id='MainBanner-button-get-card']");
    private final SelenideElement smeButton = $("[data-test-id='test-sme-link']");
    private final SelenideElement corporateButton = $("[data-test-id='test-corporate-link']");
    private final SelenideElement startBusinessButton = $("a[href='https://alfabank.ru/sme/agent/startbiz/']");
    private final ElementsCollection registerBusinessButtons = $$("button[data-widget-name='ButtonV2']");
    private final SelenideElement ipButton = registerBusinessButtons.get(0);
    private final SelenideElement oooButton = registerBusinessButtons.get(1);
    private final SelenideElement openAccountButton = $("a[data-widget-name='AnalyticsEventSender'][href='#Open-Account']");

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

    @Step("Проверка отображения поля поиска")
    public MainPage checkSearchInput() {
        searchInput.shouldBe(visible);
        return this;
    }

    @Step("Нажатие кнопки поиска 'Лупа'")
    public MainPage clickSearchButton() {
        searchButton.click();
        return this;
    }

    @Step("Осуществление поиска по слову")
    public MainPage searchFor(String query) {
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

    @Step("Нажатие на виджет 'Малому бизнесу и ИП'")
    public MainPage clickSmeButton() {
        smeButton.click();
        return this;
    }

    @Step("Нажатие на кнопку 'Зарегистрировать бизнес'")
    public MainPage clickStartBusinessButton() {
        startBusinessButton.click();
        return this;
    }

    @Step("Проверка отображения кнопки 'Открыть ИП'")
    public MainPage checkIpButton(String ipButtonName) {
        ipButton.shouldHave(text(ipButtonName));
        ipButton.shouldBe(visible).shouldBe(enabled);
        return this;
    }

    @Step("Проверка отображения кнопки 'Открыть ООО'")
    public MainPage checkOooButton(String OooButtonName) {
        oooButton.shouldHave(text(OooButtonName));
        oooButton.shouldBe(visible).shouldBe(enabled);
        return this;
    }

    @Step("Нажатие на виджет 'Среднему и крупному бизнесу'")
    public MainPage clickCorporateButton() {
        corporateButton.click();
        return this;
    }

    @Step("Проверка отображения кнопки 'Открыть счет'")
    public MainPage checkOpenAccountButton(String openAccountButtonName) {
        openAccountButton.shouldHave(text(openAccountButtonName));
        openAccountButton.shouldBe(visible).shouldBe(enabled);
        return this;
    }
}
