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
        return strength;
    }
}
