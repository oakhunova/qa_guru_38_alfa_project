package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CorporatePage;

public class CorporatePageTest extends TestBase {

    CorporatePage corporatePage = new CorporatePage();

    @Test
    @DisplayName("Проверка перехода с кнопки 'Открыть счёт' на форму заявки")
    void checkOpenAccountButton() {
        corporatePage.openCorporatePage()
                .checkOpenAccountButton("Открыть счёт")
                .clickOpenAccountButton()
                .checkOpenAccountForm("Заявка на открытие счёта для бизнеса");
    }
}
