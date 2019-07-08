package sg.edu.rp.c346.pdapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class firstExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Push Up");
        setContentView(R.layout.activity_first_exercise);
        TextView text = (TextView) findViewById(R.id.tvPushupLink);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
