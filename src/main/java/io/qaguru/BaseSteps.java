package io.qaguru;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    @Step("Open url {url}")
    public void openUrl(String url) {
        open(url);
    }

    @Step("Open repository {repository}")
    public void openRepo(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
        $(By.linkText(repository)).click();
    }

    @Step("Find and check if there is text {search}")
    public void checkText(String search) {
        $(withText(search)).should(Condition.exist);
    }
}
