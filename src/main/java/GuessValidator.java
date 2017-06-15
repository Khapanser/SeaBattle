package main.java;


public class GuessValidator {
    // валидация, что введенное число действительно является числом.
    public boolean verifyLastName(String lname)
    {
        lname = lname.trim();

        if(lname == null || lname.equals(""))
            return false;

        if(lname.matches("[a-zA-Z]*"))
            return false;

        return true;
    }


}
