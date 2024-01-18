package starter.acceptancetests;

import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.actions.*;
import starter.pageobjects.*;

@ExtendWith(SerenityJUnit5Extension.class)
    class WhenSearchingByKeyword {

        @Managed(driver = "chrome", options = "headless")
        WebDriver driver;
    
        NavigateActions navigate;
        SearchActions search;
        SearchResultSidebar searchResultSidebar;
        @Test
        public void theKeywordShouldAppearInTheResultsSidebar() {
            navigate.toTheDuckDuckGoSearchPage();
            search.byKeyword("Cucumber");
            assertThat(searchResultSidebar.heading()).isEqualTo("Cucumber");
            }
}
