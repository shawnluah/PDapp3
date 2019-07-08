package sg.edu.rp.c346.pdapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class fourthExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Bicep Curl");
        setContentView(R.layout.activity_fourth_exercise);
        TextView text = (TextView) findViewById(R.id.tvBicepCurlLink);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
