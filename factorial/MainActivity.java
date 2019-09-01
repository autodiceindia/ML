package in.autodice.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText inp;
    Button btn;
    TextView ansfield;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inp=findViewById(R.id.input);
        btn=findViewById(R.id.mybtn);
        ansfield=findViewById(R.id.output);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num= Integer.parseInt(String.valueOf(inp.getText()));
                int ans=1;
                for(int i=num; i>1; i--){
                    ans*=i;
                }
                ansfield.setText(String.valueOf(ans)+" is the factorial");
            }
        });
     }
}
