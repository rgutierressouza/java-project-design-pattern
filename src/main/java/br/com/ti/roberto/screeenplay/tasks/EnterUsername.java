package br.com.ti.roberto.screeenplay.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;


public class EnterUsername implements Task {
    private String password;

    public EnterUsername(String password) {
        this.password = password;
    }

    public static EnterUsername as(String password) {
        return Tasks.instrumented(EnterUsername.class, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(By.id("user-name"))
        );
    }
}
