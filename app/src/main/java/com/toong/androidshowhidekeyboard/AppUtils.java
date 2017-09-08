package com.toong.androidshowhidekeyboard;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by PhanVanLinh on 08/09/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class AppUtils {
    public static void showSoftKeyboard(Activity activity) {
        InputMethodManager imm =
                (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT, 0);
        }
    }

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager im =
                (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
    }

}
