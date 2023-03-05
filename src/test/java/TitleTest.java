import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TitleTest extends BaseTest {

    @ParameterizedTest(name = "{1} -  Title checked")
    @CsvFileSource(resources = "/testData.csv")
    @DisplayName("Testing Website titles")
    @Tag("Regression")
    public void shouldValidateCorrectWebsiteTitles(String url, String expectedTitle) {
        driver.get(url);
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
