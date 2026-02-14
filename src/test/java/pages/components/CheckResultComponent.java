package pages.components;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckResultComponent {
    private final SelenideElement resultsContainerSelector = $("[data-test-id='chat-component']");

    public void checkResult(String value) {
        resultsContainerSelector
                .shouldBe(visible, Duration.ofSeconds(10))
                .shouldHave(text(value));
    }
}
