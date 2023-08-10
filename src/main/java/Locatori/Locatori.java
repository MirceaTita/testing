package Locatori;

import org.openqa.selenium.By;

public class Locatori {

    public By buttonName(String buttonname) {

        switch (buttonname) {

            case "Buttons":
                return By.id("buttons");

            case "Checkboxes":
                return By.id("checkboxes");
            case "Forms1":
                return By.id("forms");
            case "Login":
                return By.id("login");
            case "Submit":
                return By.id("submitLoginBtn");
            case "Btn actions":
                return By.id("actions");
            case "Mouse hover":
                return By.id("mouse-hover");
            case "Hover over me":
                return By.id("button-hover-over");

            default:
                throw new IllegalArgumentException("This button does not exist");
        }
    }

    public By fieldName(String numeField) {

        switch (numeField) {
            case "Email":
                return By.id("email");
            case "Password":
                return By.id("password");


            default:
                throw new IllegalArgumentException("This field does not exist");

        }
    }
}