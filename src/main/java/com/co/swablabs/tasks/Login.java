package com.co.swablabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.swablabs.userintefaces.LoginPage.*;

public class Login implements Task {


    private String user = System.getProperty("username");
    private String password = System.getProperty("password");


    public static Login inThePage(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor > void performAs(T actor){
        actor.attemptsTo(Enter.theValue(user).into(TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(password).into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_LOGIN));
    }

}
