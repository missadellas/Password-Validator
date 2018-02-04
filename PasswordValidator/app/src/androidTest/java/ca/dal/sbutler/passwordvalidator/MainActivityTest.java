package ca.dal.sbutler.passwordvalidator;

import android.support.test.espresso.action.TypeTextAction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by sam on 2018-02-04.
 */

@RunWith(AndroidJUnit4.class)

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);

    private String strength1 = "word";


    @Test
    public void validationTest() {
       // onView(withId(R.id.PasswordEditText)).perform(typeText(strength1));

    }

}

