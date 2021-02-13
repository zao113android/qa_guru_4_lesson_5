package tests;

import io.qaguru.BaseSteps;
import org.junit.jupiter.api.Test;

public class MethodFindIssueGitHubTest {

    BaseSteps steps = new BaseSteps();

    String url = "http://github.com",
            search = "Issue",
            repository = "zao113android/qa_guru_4_lesson_5";

    @Test
    public void findIssueInRepository() {
        steps.openUrl(url);
        steps.openRepo(repository);

        steps.checkText(search);
    }
}
