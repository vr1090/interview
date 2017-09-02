package kmklabs.com.interview

import android.support.test.espresso.Espresso
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(AndroidJUnit4::class)
class MovieActivityTest{
    //@get:Rule
    @get:Rule
    val activity = ActivityTestRule<MovieActivity>(MovieActivity::class.java,true,false)

    @Test
    fun should_just_pass(){
        activity.launchActivity(null)
        assertEquals(10,10)
    }

    @Test
    fun should_show_title(){
        activity.launchActivity(null)
        Espresso.onView( ViewMatchers.withId(R.id.title)).check(ViewAssertions.matches(ViewMatchers.withText(Presenter.getTitle())))
    }
}

