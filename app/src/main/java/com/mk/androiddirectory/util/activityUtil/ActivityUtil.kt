package com.mk.androiddirectory.util.activityUtil

import android.transition.Slide
import android.view.Gravity
import android.view.Window

class ActivityUtil {
}


/*
usage:  setSlide()
        window.setAnimation()
^ before activity's setContentView()

val options = ActivityOptions.makeSceneTransitionAnimation(this)
startActivity(Intent(this, activityClass) , options.toBundle())

        <item name="android:windowContentTransitions">true</item>
^ in app theme

*/
fun Window.setSlide() {
    var slide =  Slide();
    slide.slideEdge = Gravity.LEFT;
    slide.duration = 500;
    exitTransition = slide;
    enterTransition = slide;
}