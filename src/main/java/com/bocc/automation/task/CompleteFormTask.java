package com.bocc.automation.task;

import com.bocc.automation.ui.BoccSimulatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import static com.bocc.automation.ui.BoccDataPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteFormTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BoccSimulatorPage.list_Company),
                Enter.theValue(company).into(BoccSimulatorPage.list_Company),
                Enter.keyValues(Keys.ARROW_DOWN).into(BoccSimulatorPage.list_Company),
                Enter.keyValues(Keys.ENTER).into(BoccSimulatorPage.list_Company),
                Enter.theValue(amount).into(BoccSimulatorPage.txt_amount),
                SelectFromOptions.byVisibleText(term).from(BoccSimulatorPage.lst_Term),
                JavaScriptClick.on(BoccSimulatorPage.btn_Insurance)
        );
    }
    public static Performable input() {
        return instrumented(CompleteFormTask.class);
    }
}
