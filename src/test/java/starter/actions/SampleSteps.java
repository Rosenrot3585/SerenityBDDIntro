package starter.actions;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.SearchForm;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SampleSteps extends UIInteractionSteps {
    private int sum;

    @Step

    public void performSomeAction(int a, int b) {
        sum = a + b;
        System.out.println(sum);
    }

    @Step

    public void verifyResult(int expectedSum) {

        // Implement assertions or verifications here
        Assertions.assertEquals(expectedSum, sum, "Sum does not match the expected value");
    }

}