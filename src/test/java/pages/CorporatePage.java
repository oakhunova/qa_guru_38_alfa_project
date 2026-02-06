package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CorporatePage {

    private final SelenideElement openAccountButton = $("a[data-widget-name='AnalyticsEventSender'][href='#Open-Account']");
    private final SelenideElement openAccountForm = $("form[data-test-id='sme-native-form']");

    @Step("Открытие сайта в браузере")
    public CorporatePage openCorporatePage() {
        open("https://alfabank.ru/corporate/");
        return this;
    }

    @Step("Проверка отображения кнопки 'Открыть счет'")
    public CorporatePage checkOpenAccountButton(String openAccountButtonName) {
        openAccountButton.shouldHave(text(openAccountButtonName));
        openAccountButton.shouldBe(visible).shouldBe(enabled);
        return this;
    }

    @Step ("Нажатие на кнопку 'Открыть счет'")
    public CorporatePage clickOpenAccountButton() {
        openAccountButton.click();
        return this;
    }

    @Step ("Проверка отображения заявки на открытие счета")
    public CorporatePage checkOpenAccountForm(String openAccountFormName) {
        openAccountForm.shouldBe(visible);
        openAccountForm.shouldHave(text(openAccountFormName));
        return this;
    }
}
