package com.bocc.automation.task;

import com.bocc.automation.ui.BoccHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new BoccHomePage()));
    }

    public static Performable on() {
        return instrumented(OpenTheBrowserTask.class);
    }

}
