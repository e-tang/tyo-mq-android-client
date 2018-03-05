package au.com.tyo.demo.appfront.ui.page;

import android.app.Activity;

import au.com.tyo.app.Controller;
import au.com.tyo.app.ui.page.Page;
import au.com.tyo.demo.appfront.R;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 27/11/17.
 */

public class PageCommon extends Page {

    protected au.com.tyo.demo.appfront.Controller controller;

    /**
     * @param controller
     * @param activity
     */
    public PageCommon(Controller controller, Activity activity) {
        super(controller, activity);

        this.controller = (au.com.tyo.demo.appfront.Controller) controller;

        toolbarColor = activity.getResources().getColor(R.color.toolbarColor);
        titleTextColor = activity.getResources().getColor(R.color.white);
    }

}
