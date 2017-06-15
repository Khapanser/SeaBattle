package main.java;


public class GuessValidator {
    // Check for a number
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
