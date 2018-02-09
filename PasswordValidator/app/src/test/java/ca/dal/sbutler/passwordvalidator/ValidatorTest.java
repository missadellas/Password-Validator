package ca.dal.sbutler.passwordvalidator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sam on 2018-02-04.
 */
public class ValidatorTest {

    static Validator v = new Validator();



//stage1 tests

    @Test
    public void validateRule2() throws Exception {

        //follows rule 2 only
        assertEquals(1, v.validate("password"));
    }
    @Test

    public void validateRule1() throws Exception {

        //follows rule 1 only
        assertEquals(1, v.validate("toshort"));
    }
    @Test

    public void validateRule1and2() throws Exception {

        //follows rules 1 and 2
        assertEquals(2, v.validate("averylongpassword"));
    }
    //stage 2 tests

    @Test
    public void validateRule1and3() throws Exception {

    //follows rules 1 and 3
    assertEquals(2, v.validate("Hello"));
    }
    @Test
    public void validateRule123() throws Exception{

        //follows rules 1,2,3
        assertEquals(3, v.validate("aVeryLOngPassword"));
    }
    @Test

    public void validateRule2and3() throws Exception {

        //follows rules 2 and 3
        assertEquals(2, v.validate("Password"));
    }
    @Test

    public void validateRule1and4() throws Exception {

        //follows rule 1 and 4
        assertEquals(2, v.validate("0"));
    }
    @Test

    public void validateRule1234() throws Exception {

        //follows 1,2,3,4
        assertEquals(4, v.validate("AbetterPas9word"));
    }
    @Test

    public void validateRule134() throws Exception {

        //follows 1,3,4
        assertEquals(3, v.validate("oK7"));
    }
    @Test

    public void validateRule124() throws Exception {

        //follows 1,2,4
        assertEquals(3, v.validate("longenough888"));
    }
    @Test

    public void validateRule12345() throws Exception {

        //follows 1,2,3,4,5
        assertEquals(5, v.validate("Avery9pas$word"));
    }
    @Test

    public void validateRule1and5() throws Exception {

        //follows 1 and 5
        assertEquals(2, v.validate("@sam"));
    }
    @Test

    public void validateRule135() throws Exception {

        //follows 1,3,5
        assertEquals(3, v.validate("S!m"));
    }

}