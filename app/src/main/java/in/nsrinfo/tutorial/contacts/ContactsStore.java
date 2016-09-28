package in.nsrinfo.tutorial.contacts;

import android.content.Context;
import android.os.Build;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SAIBABU REDDY N on 28-09-2016.
 */

public class ContactsStore {

    public static List<String> getContactsList(Context context){
        List<String> contactsList = new ArrayList<>();

        String NAME = Build.VERSION.SDK_INT
                >= Build.VERSION_CODES.HONEYCOMB ?
                ContactsContract.Contacts.DISPLAY_NAME_PRIMARY :
                ContactsContract.Contacts.DISPLAY_NAME;

        

        return contactsList;
    }
}
