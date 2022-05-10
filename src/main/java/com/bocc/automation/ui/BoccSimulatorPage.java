package com.bocc.automation.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BoccSimulatorPage extends PageObject {
    public static final Target list_Company = Target.the("Search_Company").located(By.id("nombreEmpresaSimulador"));
    public static final Target txt_amount = Target.the("Input_Amount").locatedBy("(//input[@name='valorSolicitado'])[1]");
    public static final Target lst_Term = Target.the("Term").locatedBy("//select[@name='plazo']");
    public static final Target btn_Insurance = Target.the("Insurance").locatedBy("//label[@for='cmn-toggle-1']");
    public static final Target validation = Target.the("Validation").locatedBy("//b[@class='ng-binding']");

}
