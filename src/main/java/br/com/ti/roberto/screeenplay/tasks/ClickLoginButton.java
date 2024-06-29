package br.com.ti.roberto.screeenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class ClickLoginButton implements Interaction {
    public static ClickLoginButton now() {
        return Tasks.instrumented(ClickLoginButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(By.className("submit-button"))
        );
    }
}
