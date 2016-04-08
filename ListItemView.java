package mashup.ac.kr.listviewphw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Yoonyeong Kim on 2016-04-08.
 */
public class ListItemView extends LinearLayout {
    TextView namesTextView;//밖에 정의해서 다른 애들도 쓸 수 있게
    TextView phonesTextView;
    public ListItemView(Context context) {
        super(context);

        init(context);
    }

    public ListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }
    public void init(Context context) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.listview, this, true);

        namesTextView = (TextView) findViewById(R.id.names);
        phonesTextView = (TextView) findViewById(R.id.phones);
    }
        public void setName(String name){
            namesTextView.setText(name);
        }
        public void setPhone(String phone){
            phonesTextView.setText(phone);
        }

    }

