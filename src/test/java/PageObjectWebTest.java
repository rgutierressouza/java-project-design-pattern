import br.com.ti.roberto.factory.DriverFactory;
import br.com.ti.roberto.pageobjects.pages.HomePage;
import br.com.ti.roberto.pageobjects.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PageObjectWebTest {
    public static WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeEach
    public void setUp() {
        driver = DriverFactory.createDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void testSelenium() {
        driver.get("https://www.saucedemo.com/");
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        assertThat(homePage.isTitleDisplayed(), is(true));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
