package com.android.xzl.myapplication.Utils;
 
import android.content.Context;
import android.widget.Toast;

/**无限土司
 * Author：  KuenCheung
 * Email：   zhang_quan_888@163.com
 * Time：    2018/6/2
 * Description：吐司工具类
 */
//todo 注意：为了防止内存泄漏，需要在activity或者fragment中destory方法中加入： if (MyToast.toast != null) MyToast.toast = null;
public final class MyToast {
    private MyToast() { }
 
    public static boolean isShow = true;
    public static Toast toast;
 
    //短时间显示Toast
    public static void showShort(Context context, CharSequence message) {
        if (isShow) {
            if (toast == null) {
                toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            } else {
                toast.cancel();//关闭吐司显示
                toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }
 
    //短时间显示Toast
    public static void showShort(Context context, int message) {
        if (isShow) {
            if (toast == null) {
                toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            } else {
                toast.cancel();//关闭吐司显示
                toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }
 
    //长时间显示Toast
    public static void showLong(Context context, CharSequence message) {
        if (isShow) {
            if (toast == null) {
                toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            } else {
                toast.cancel();//关闭吐司显示
                toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            }
            toast.show();
        }
    }
 
    //长时间显示Toast
    public static void showLong(Context context, int message) {
        if (isShow) {
            if (toast == null) {
                toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            } else {
                toast.cancel();//关闭吐司显示
                toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
            }
            toast.show();
        }
    }
 
    //自定义显示Toast时间
    public static void show(Context context, CharSequence message, int duration) {
        if (isShow) {
            Toast.makeText(context, message, duration).show();
        }
    }
 
    //自定义显示Toast时间
    public static void show(Context context, int message, int duration) {
        if (isShow) {
            Toast.makeText(context, message, duration).show();
        }
    }
}