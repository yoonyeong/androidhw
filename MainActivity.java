package mashup.ac.kr.listviewphw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListViewAdaptor adaptor;
    String[] name = {"양소현", "유슬기", "김정민", "김동희"};
    String[] phone = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        adaptor = new ListViewAdaptor();
        adaptor.addItem(new ListItem(name[0], phone[0]));
        adaptor.addItem(new ListItem(name[1], phone[1]));
        adaptor.addItem(new ListItem(name[2], phone[2]));
        adaptor.addItem(new ListItem(name[3], phone[3]));
        adaptor.addItem(new ListItem(name[4], phone[4]));

        listView.setAdapter(adaptor);

    }

    public class ListViewAdaptor extends BaseAdapter {

        ArrayList items = new ArrayList();

        public void addItem(ListItem item) {
            items.add(item);
        }

        public int getCount() {
            return name.length;
        }

        @Override
        public Object getItem(int position) {
            return name[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            //TextView view = new TextView(getApplicationContext());

            // ListItemView view = new ListItemView(getApplicationContext());
            //view.setName(name[position]);
            //view.setPhone(phone[position]);

            //return view;
            //}
            ListItemView view = null;

            if (convertView == null) {
                view = new ListItemView(getApplicationContext());
            } else {
                view = (ListItemView) convertView;
            }
            return view;
        }
    }
}

