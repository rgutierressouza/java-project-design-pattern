package br.com.ti.roberto.screeenplay.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;


public class EnterPassword implements Task {
    private String username;

    public EnterPassword(String username) {
        this.username = username;
    }

    public static EnterPassword as(String username) {
        return Tasks.instrumented(EnterPassword.class, username);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(By.id("password"))
        );
    }
}
