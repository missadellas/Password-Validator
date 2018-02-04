package ca.dal.sbutler.passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sam on 2018-02-04.
 */
public class ValidatorTest {
    @Test
    public void validate() throws Exception {

        Validator v = new Validator();

        //follows rule 2 only
        assertEquals(1, v.validate("password"));
        //follows rule 1 only
        assertEquals(1, v.validate("toshort"));
        //follows rules 1 and 2
        assertEquals(2,v.validate("averylongpassword"));
    }

}