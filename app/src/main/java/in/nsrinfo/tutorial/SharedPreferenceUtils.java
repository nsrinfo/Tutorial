package in.nsrinfo.tutorial;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by SAIBABU REDDY N on 07-10-2016.
 */

public class SharedPreferenceUtils {

    public static SharedPreferences getSharedPreferences(Activity activity, String name) {
        if (name == null || name.isEmpty())
            return activity.getPreferences(Context.MODE_PRIVATE);
        return activity.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public static void writeToSharedPreference(Activity activity, String name, String key, String value){
        SharedPreferences preferences = getSharedPreferences(activity, name);

    }

}
