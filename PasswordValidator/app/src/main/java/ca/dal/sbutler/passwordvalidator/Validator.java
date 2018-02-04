package ca.dal.sbutler.passwordvalidator;

/**
 * Created by sam on 2018-02-04.
 */

public class Validator {

    public int validate(String password) {
        int strength = 0;
        //rule 1
        if (!password.equalsIgnoreCase("password")) {
            strength++;
        }
        if (password.length() >= 8) {
            //rule 2
            strength++;
        }

        //rule 3 must contain at least one uppercase letter
        for (int i = 0; i < password.length(); i++) {
            int asciiChar = (int) password.charAt(i);

            if (asciiChar <= 90 && asciiChar >= 65) {
                strength++;
                break;
            }
        }
        //rule 4 must contain at least 1 digit
        for (int i = 0; i < password.length(); i++) {
            int asciiChar = (int) password.charAt(i);
            if (asciiChar <= 57 && asciiChar >= 48) {
                strength++;
                break;
            }
        }
        //rule 5 contains a special character
        for (int i = 0; i < password.length(); i++) {
            int asciiChar = (int) password.charAt(i);
            if (asciiChar >= 33 && asciiChar < 48 || asciiChar > 57 && asciiChar < 65 || asciiChar > 90 && asciiChar < 97 || asciiChar > 122 && asciiChar <= 126) {
                strength++;
                break;
            }

        }
        return strength;
    }

    //feedback based on strength of password
    public String determineStrength(int strength){
        String result = "";
        if(strength==1){
            result= "Password is very weak";
        }
        else if(strength==2){
            result= "Password is weak";
        }
        else if(strength==3){
            result = "Password is not strong enough";
        }
        else if(strength==4){
            result = "Password is strong";
        }
        else{
            result= "Password is very Strong";
        }
        return result;
    }

}