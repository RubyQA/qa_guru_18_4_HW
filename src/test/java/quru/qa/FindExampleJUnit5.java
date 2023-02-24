package quru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindExampleJUnit5 {
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1700x1200";

    }

    @Test
    void exampleJUnitCheck() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").shouldBe(text("Soft assertions"));
        $(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
