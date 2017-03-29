package asi.fairydustapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    int clickCount = 0;
    int stepVar = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount++;
                button.setText(button.getText() + "\n Klikniety " + clickCount + " razy" );

                if(clickCount==stepVar){
                    Toast.makeText(MainActivity.this, "Przechodzimy bo doliczylismy do " + stepVar,Toast.LENGTH_LONG).show();
                    StartNewActivity();
                }


            }
        });
    }
    private void StartNewActivity() {
        Intent intent = new Intent(this, FormActivity.class); //do intent skad do kad
        startActivity(intent);
    }


}
