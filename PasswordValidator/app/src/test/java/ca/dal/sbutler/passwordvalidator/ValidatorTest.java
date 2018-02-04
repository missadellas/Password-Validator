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
//stage1 tests
        //follows rule 2 only
        assertEquals(1, v.validate("password"));
        //follows rule 1 only
        assertEquals(1, v.validate("toshort"));
        //follows rules 1 and 2
        assertEquals(2,v.validate("averylongpassword"));
//stage2 tests
        //follows rules 1 and 3
        assertEquals(2, v.validate("Hello"));
        //follows rules 1,2,3
        assertEquals(3,v.validate("aVeryLOngPassword"));
        //follows rules 2 and 3
        assertEquals(2,v.validate("Password"));
        //follows rule 1 and 4
        assertEquals(2,v.validate("0"));
        //follows 1,2,3,4
        assertEquals(4,v.validate("AbetterPas9word"));
        //follows 1,3,4
        assertEquals( 3, v.validate("oK7"));
        //follows 1,2,4
        assertEquals(3,v.validate("longenough888"));
        //follows 1,2,3,4,5
        assertEquals(5, v.validate("Avery9pas$word"));
        //follows 1 and 5
        assertEquals(2, v.validate("@sam"));
        //follows 1,3,5
        assertEquals(3, v.validate("S!m"));
    }

}