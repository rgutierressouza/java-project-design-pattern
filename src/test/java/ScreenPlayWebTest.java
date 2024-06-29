import br.com.ti.roberto.factory.DriverFactory;
import br.com.ti.roberto.screeenplay.tasks.ClickLoginButton;
import br.com.ti.roberto.screeenplay.tasks.EnterPassword;
import br.com.ti.roberto.screeenplay.tasks.EnterUsername;
import br.com.ti.roberto.screeenplay.tasks.TitleIsDisplayed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Visibility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ScreenPlayWebTest {

    private Actor user;

    @BeforeEach
    public void setUp() {
        WebDriver driver = DriverFactory.createDriver();
        user = Actor.named("User").whoCan(BrowseTheWeb.with(driver));
    }

    @Test
    public void testSelenium() {
        user.attemptsTo(
                net.serenitybdd.screenplay.actions.Open.url("https://www.saucedemo.com/"),
                EnterUsername.as("standard_user"),
                EnterPassword.as("secret_sauce"),
                ClickLoginButton.now()
        );

        assertThat(user.asksFor(Visibility.of(".title")), is(true));

    }

    @AfterEach
    public void tearDown() {
        BrowseTheWeb.as(user).getDriver().quit();
    }
}
