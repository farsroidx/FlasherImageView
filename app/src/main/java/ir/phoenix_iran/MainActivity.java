package ir.phoenix_iran;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FlasherImageView flasherImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flasherImageView = findViewById(R.id.fiv);

        initHandler(true , 2000);

        initHandler(false , 6000);
    }

    private void initHandler(final boolean state , int delay){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                flasherImageView.autoChange(state);

                if(state){
                    flasherImageView.start();
                    Toast.makeText(MainActivity.this, "alarm activated", Toast.LENGTH_SHORT).show();
                }
                else {
                    flasherImageView.stop();
                    Toast.makeText(MainActivity.this, "alarm dis_activated", Toast.LENGTH_SHORT).show();
                }
            }
        } , delay);
    }
}
