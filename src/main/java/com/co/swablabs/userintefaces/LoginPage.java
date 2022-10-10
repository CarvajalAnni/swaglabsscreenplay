package com.co.swablabs.userintefaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("Campo de texto para username").locatedBy("//input[@id='user-name']");
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para password").locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN = Target.the("Botón para inicio de sesión").locatedBy("//input[@id='login-button']");

}
