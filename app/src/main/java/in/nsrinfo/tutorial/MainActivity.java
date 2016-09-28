package in.nsrinfo.tutorial;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private final String[] TOPICS_LIST = {"Sms", "ContactsList"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1, TOPICS_LIST);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position){
            case 0 :
                startActivity(new Intent(MainActivity.this, SmsListActivity.class));
                break;
            case 1 :

                break;
        }
    }

    private void showToast(){
        Toast.makeText(this, "Tutorial under preparation", Toast.LENGTH_LONG).show();
    }
}
