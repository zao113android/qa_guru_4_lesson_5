package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaFindIssueGitHubTest {

    @Test
    public void findIssueInRepository() {

        String url = "http://github.com",
                search = "Issue",
                repository = "zao113android/qa_guru_4_lesson_5";

        step("Open url", () -> {
            open(url);
        });

        step("Open repository", () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(repository);
            $(".header-search-input").submit();
            $(By.linkText(repository)).click();
        });

        step("Find and check if there is text" + search, () -> {
            $(withText(search)).should(Condition.exist);
        });
    }
}
