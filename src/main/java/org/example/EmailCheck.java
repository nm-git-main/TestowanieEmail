package org.example;

//Wykorzystując podejście TDD napisz metodę sprawdzającą poprawność
//podanego w parametrze adresu e-mail.
public class EmailCheck {
    public static boolean isValidEmail(String adressEmail) {
        boolean isExpected= adressEmail.matches("[a-zA-Z0-9]{3,16}@[a-z]+\\.[a-z]{2,3}") ;
        return isExpected;
    }
}
