package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SmePage {
    private final SelenideElement startBusinessButton = $("a[href='https://alfabank.ru/sme/agent/startbiz/']");
    private final ElementsCollection registerBusinessButtons = $$("button[data-widget-name='ButtonV2']");
    private final SelenideElement ipButton = registerBusinessButtons.get(0);
    private final SelenideElement oooButton = registerBusinessButtons.get(1);
    private final SelenideElement payServiceButton = $$("div[data-widget-name='Aligner']").findBy(text("Эквайринг от 1%"));
    private final SelenideElement reservationButton = $("button[data-test-id='reservationMainButton']");
    private final SelenideElement errorMessage = $("span[data-test-id='phoneInput-form-control-error-message']");

    @Step("Открытие сайта в браузере")
    public SmePage openSmePage() {
        open("https://alfabank.ru/sme/");
        return this;
    }

    @Step("Нажатие на кнопку 'Зарегистрировать бизнес'")
    public SmePage clickStartBusinessButton() {
        startBusinessButton.click();
        return this;
    }

    @Step("Проверка отображения кнопки 'Открыть ИП'")
    public SmePage checkIpButton(String ipButtonName) {
        ipButton.shouldHave(text(ipButtonName));
        ipButton.shouldBe(visible).shouldBe(enabled);
        return this;
    }

    @Step("Проверка отображения кнопки 'Открыть ООО'")
    public SmePage checkOooButton(String OooButtonName) {
        oooButton.shouldHave(text(OooButtonName));
        oooButton.shouldBe(visible).shouldBe(enabled);
        return this;
    }

    @Step("Нажатие на виджет 'Эквайринг от 1%'")
    public SmePage clickPayServiceButton() {
        payServiceButton.click();
        return this;
    }

    @Step("Нажатие на кнопку 'Отправить заявку без заполненного номера телефона'")
    public SmePage clickReservationButton() {
        reservationButton.click();
        return this;
    }

    @Step("Проверка отображения сообщения об ошибке")
    public SmePage checkErrorMessage() {
        errorMessage.shouldBe(visible);
        return this;
    }
}
