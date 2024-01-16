package starter.acceptancetests;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTags;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.annotations.Narrative;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.actions.SampleSteps;

import static org.assertj.core.api.Assertions.assertThat;

@Narrative(text = {"This is a sample Serenity BDD test."})

@WithTags({@WithTag("sample")})

public class SerenityTest {

    @Steps

    SampleSteps sampleSteps;


    @Test

    public void verifySerenityBDDSetup() {

        sampleSteps.performSomeAction(3,5);

        sampleSteps.verifyResult(8);

    }

}