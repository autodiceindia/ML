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
    EditText inp1, inp2;
    Button btn;
    TextView ansfield;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inp1=findViewById(R.id.input1);
        inp2=findViewById(R.id.input2);
        btn=findViewById(R.id.mybtn);
        ansfield=findViewById(R.id.output);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(String.valueOf(inp1.getText()));
                num2=Integer.parseInt(String.valueOf(inp2.getText()));
                if(num1>num2){
                    int temp=num1;
                    num1=num2;
                    num2=temp;
                }
                String op="";
                for(int i=num1; i<=num2; i++){
                    if(i%2==0){
                        op+=" "+i;
                    }
                }
                ansfield.setText(op);
            }
        });
     }
}
