package eli.com.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eli.com.library.ESDKMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ESDKMain.init();
    }
}
