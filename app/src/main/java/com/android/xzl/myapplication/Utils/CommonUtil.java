package com.android.xzl.myapplication.Utils;

import android.widget.Toast;

import com.android.xzl.myapplication.SignUpApplication;


/***
 * toast
 */
public class CommonUtil {
    private static Toast toast;

    public static void showToast(
            String content) {
        if (toast == null) {
            toast = Toast.makeText(SignUpApplication.getAppContext(),
                    content,
                    Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }
}