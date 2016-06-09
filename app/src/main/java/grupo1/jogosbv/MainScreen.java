package grupo1.jogosbv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {
    Button bttn1;
    Button bttn2;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        text = (TextView) findViewById(R.id.textView);
        text.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32);

        bttn1 = (Button) findViewById(R.id.button);
        //bttn1.setOnClickListener(startActivity(getApplicationContext(this),GameScreen.class));

        bttn2 = (Button) findViewById(R.id.button2);
        //bttn2.setOnClickListener(startActivity(new Intent(getApplicationContext(this),Howto.class)););


    };


}

