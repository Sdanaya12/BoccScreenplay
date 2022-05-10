package com.bocc.automation.questions;


import com.bocc.automation.ui.BoccSimulatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;
import net.thucydides.core.annotations.ManagedWebDriverAnnotatedField;

import static com.bocc.automation.ui.BoccSimulatorPage.validation;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AmountQuestion {

    public static Question<String> value(){
        return actor -> Text.of(validation).viewedBy(actor).asString();
    }

}
