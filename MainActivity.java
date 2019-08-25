package in.autodice.demoapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mybtn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybtn=findViewById(R.id.mybutton);
        textView=findViewById(R.id.output);
    }

    public void displayMessage(View view) {
        textView.setText("Hello World");
    }
}
