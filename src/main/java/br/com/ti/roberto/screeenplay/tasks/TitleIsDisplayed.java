package br.com.ti.roberto.screeenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;

public class TitleIsDisplayed implements Question<Boolean> {
    public static TitleIsDisplayed displayed() {
        return new TitleIsDisplayed();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(
                Text.of(By.className("title")).asBoolean()
        );
    }
}
