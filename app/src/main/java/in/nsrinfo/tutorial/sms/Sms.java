package in.nsrinfo.tutorial.sms;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.Telephony;
import android.support.annotation.RequiresApi;
import android.telephony.TelephonyManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SAIBABU REDDY N on 28-09-2016.
 */

public class Sms {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static List<String> getSmsList(Context context) {
        List<String> smsList = new ArrayList<>();

        Cursor cursor = context.getContentResolver().query(Telephony.Sms.Inbox.CONTENT_URI, new String[]{Telephony.Sms.Inbox.BODY}, null, null, null);
        if (cursor != null){
            while (cursor.moveToNext()){
                String message = cursor.getString(cursor.getColumnIndex(Telephony.Sms.Inbox.BODY));
                smsList.add(message);
            }
        }
        return smsList;
    }
}