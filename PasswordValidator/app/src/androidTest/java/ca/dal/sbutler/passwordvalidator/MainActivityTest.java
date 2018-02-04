package ca.dal.sbutler.passwordvalidator;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by sam on 2018-02-04.
 */

@RunWith(AndroidJUnit4.class)

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule(MainActivity.class);

    private String strength1 = "word";
    private String   result1= "Password is very weak";

    private String strength2 = "notagoodpassword";
    private String   result2= "Password is weak";

    private String strength3 = "1%sam";
    private String   result3 = "Password is not strong enough";

    private String strength4 = "1%Sam";
    private String   result4 = "Password is strong";

    private String strength5 = "$amsVery5rongpassword";
    private String   result5= "Password is very Strong";


    @Test
    public void validationTest() throws Exception {
        //test password of strength 1
        Espresso.onView(withId(R.id.PasswordEditText)).perform(typeText(strength1));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.ValidateBtn)).perform(click());
        Espresso.onView(withId(R.id.StrengthTextView)).check(matches(withText(result1)));
        Espresso.onView(withId(R.id.PasswordEditText)).perform(clearText());

        //test password of strength 2
        Espresso.onView(withId(R.id.PasswordEditText)).perform(typeText(strength2));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.ValidateBtn)).perform(click());
        Espresso.onView(withId(R.id.StrengthTextView)).check(matches(withText(result2)));
        Espresso.onView(withId(R.id.PasswordEditText)).perform(clearText());

        //test password of strength 3
        Espresso.onView(withId(R.id.PasswordEditText)).perform(typeText(strength3));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.ValidateBtn)).perform(click());
        Espresso.onView(withId(R.id.StrengthTextView)).check(matches(withText(result3)));
        Espresso.onView(withId(R.id.PasswordEditText)).perform(clearText());

        //test password of strength 4
        Espresso.onView(withId(R.id.PasswordEditText)).perform(typeText(strength4));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.ValidateBtn)).perform(click());
        Espresso.onView(withId(R.id.StrengthTextView)).check(matches(withText(result4)));
        Espresso.onView(withId(R.id.PasswordEditText)).perform(clearText());

        //test password of strength 5
        Espresso.onView(withId(R.id.PasswordEditText)).perform(typeText(strength5));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.ValidateBtn)).perform(click());
        Espresso.onView(withId(R.id.StrengthTextView)).check(matches(withText(result5)));
        Espresso.onView(withId(R.id.PasswordEditText)).perform(clearText());

    }

}

