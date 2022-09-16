package com.nttdata.steps;

import com.nttdata.screens.*;
import net.thucydides.core.annotations.Step;

public class SwagLabsSteps {

    LoginSwagLabs loginScreenSwagLabs;
    ProductsSwagLabs productsSwagLabs;

    @Step("Inciar")
    public void init()
    {
        loginScreenSwagLabs.iniciar();
    }

    @Step("Ingresar Usuario")
    public void ingresarUser(String user){
        loginScreenSwagLabs.llenarcampoUsuario(user);
    }
    @Step("Ingresar Password")
    public void ingresarContraseña(String password){
        loginScreenSwagLabs.llenarcampoContrasena(password);
    }

    @Step("Click en el Boton login")
    public void clicLogin(){
        loginScreenSwagLabs.clickButton();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return productsSwagLabs.getResultText();
    }
    @Step("Click en el Boton login")
    public void itemsize(){
        productsSwagLabs.Itemcant();
    }
}
