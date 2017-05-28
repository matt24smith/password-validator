package com.acme.csci3130;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SimpleEspressoTest {

    private String textToFind;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initString()
    {
        textToFind = "Hello World!";
    }

    @Test
    public void findText()
    {
        //Tries to find the text on the screen
        //Return true if it matches the expected test
        onView(withId(R.id.helloText)).check(matches(withText(textToFind)));

        //Same thing but not using IDs
        //It does not makes much sense in this case
        onView(withText(textToFind)).check(matches(withText(textToFind)));



    }

    public void validatePassword(){
        //onView( withId(R.id.button)).perform(click());
        onView(withId(R.id.helloText)).check(matches(withText("Password Strength: 5/5")));


    }



}
