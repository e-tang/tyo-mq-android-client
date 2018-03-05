package au.com.tyo.demo.appfront;

import au.com.tyo.demo.appfront.ui.UI;

/**
 * Created by Eric Tang (eric.tang@tyo.com.au) on 24/11/17.
 */

public interface Controller extends au.com.tyo.app.Controller<UI> {

    boolean hasUserLoggedIn();

}
