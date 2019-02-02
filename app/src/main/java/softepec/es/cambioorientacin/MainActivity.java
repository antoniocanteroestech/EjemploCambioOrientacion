package softepec.es.cambioorientacin;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String ORIENTATION_PORTRAIT = "vertical";
    static final String ORIENTATION_LANDSCAPE = "horizontal";
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        if(getRotation(getApplicationContext()).equals(ORIENTATION_PORTRAIT)){
            tv.setText("PORTRAIT");
        }else{
            tv.setText("LANDSCAPE");
        }

    }



    public String getRotation(Context context){
        final int rotation = getWindowManager().getDefaultDisplay().getRotation();

        if (rotation == Surface.ROTATION_0 || rotation == Surface.ROTATION_180) {
            return ORIENTATION_PORTRAIT;
        } else {
            return ORIENTATION_LANDSCAPE;
        }

    }


}
