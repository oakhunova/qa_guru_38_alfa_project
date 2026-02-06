package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SmePage;

public class SmePageTest extends TestBase {

   SmePage smePage = new SmePage();

    @Test
    @DisplayName("Проверка наличия кнопок 'Открыть ИП' и 'Открыть ООО'")
    void checkStartBusinessButtons() {
        smePage.openSmePage()
                .clickStartBusinessButton()
                .checkIpButton("Открыть ИП")
                .checkOooButton("Открыть ООО");
    }

    @Test
    @DisplayName("Проверка валидации заявки на подключение эквайринга")
    void checkPayServiceValidation() {
        smePage.openSmePage()
                .clickPayServiceButton()
                .clickReservationButton()
                .checkErrorMessage();
    }
}



