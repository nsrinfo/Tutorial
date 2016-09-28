package in.nsrinfo.tutorial;

import android.app.ListActivity;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import in.nsrinfo.tutorial.sms.Sms;

public class SmsListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_list);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1, Sms.getSmsList(this));
            setListAdapter(adapter);
        }else{
            Toast.makeText(this, "Version not supported", Toast.LENGTH_LONG).show();
        }
    }
}
