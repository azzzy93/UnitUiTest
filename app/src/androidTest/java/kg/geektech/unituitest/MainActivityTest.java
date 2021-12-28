package kg.geektech.unituitest;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void checkAddOperations(){
        addTest("2", "3", "5");
        addTest("-2", "3", "1");
        addTest("", "3", "3");
        addTest("", "", "0");
        addTest("ad", "gt", "Введите цифры");
        addTest("    2", "   3     ", "5");
        addTest("2", "0", "2");
    }

    public void addTest(String a, String b, String result){
        onView(withId(R.id.et_first_num)).perform(typeText(a));
        onView(withId(R.id.et_second_num)).perform(typeText(b));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText(result)));

        onView(withId(R.id.et_first_num)).perform(clearText());
        onView(withId(R.id.et_second_num)).perform(clearText());
    }

    @Test
    public void checkSubOperations(){
        subTest("2", "3", "-1");
        subTest("-2", "3", "-5");
        subTest("", "3", "-3");
        subTest("", "", "0");
        subTest("ad", "gt", "Введите цифры");
        subTest("    2", "   3     ", "-1");
        subTest("2", "0", "2");
    }

    public void subTest(String a, String b, String result){
        onView(withId(R.id.et_first_num)).perform(typeText(a));
        onView(withId(R.id.et_second_num)).perform(typeText(b));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText(result)));

        onView(withId(R.id.et_first_num)).perform(clearText());
        onView(withId(R.id.et_second_num)).perform(clearText());
    }

    @Test
    public void checkMultOperations(){
        multTest("2", "3", "6");
        multTest("-2", "3", "-6");
        multTest("", "3", "0");
        multTest("", "", "0");
        multTest("ad", "gt", "Введите цифры");
        multTest("    2", "   3     ", "6");
        multTest("2", "0", "0");
    }

    public void multTest(String a, String b, String result){
        onView(withId(R.id.et_first_num)).perform(typeText(a));
        onView(withId(R.id.et_second_num)).perform(typeText(b));
        onView(withId(R.id.btn_mult)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText(result)));

        onView(withId(R.id.et_first_num)).perform(clearText());
        onView(withId(R.id.et_second_num)).perform(clearText());
    }

    @Test
    public void checkDivOperations(){
        divTest("4", "2", "2");
        divTest("-6", "3", "-2");
        divTest("", "3", "0");
        divTest("", "", "Нельзя делить на ноль");
        divTest("ad", "gt", "Введите цифры");
        divTest("    12", "   3     ", "4");
        divTest("2", "0", "Нельзя делить на ноль");
    }

    public void divTest(String a, String b, String result){
        onView(withId(R.id.et_first_num)).perform(typeText(a));
        onView(withId(R.id.et_second_num)).perform(typeText(b));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText(result)));

        onView(withId(R.id.et_first_num)).perform(clearText());
        onView(withId(R.id.et_second_num)).perform(clearText());
    }
}
