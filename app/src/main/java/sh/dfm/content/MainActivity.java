package sh.dfm.content;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ColorSpec spec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //text2.setText(spec.getEffect(String.valueOf(spinner.getSelectedItem())));

    public void onClickColorEffect(View view) {
        Log.d("MainActivity", "onClickColorEffect");
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        TextView text2 = (TextView) findViewById(R.id.textView2);//нейминг!!!
        String color = String.valueOf(spinner.getSelectedItem());



        spec = new ColorSpec(getApplicationContext());
        String result = spec.getEffect(color);
        text2.setText(result);
    }
}
