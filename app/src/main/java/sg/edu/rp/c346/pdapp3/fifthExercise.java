package sg.edu.rp.c346.pdapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class fifthExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Leg Raise");
        setContentView(R.layout.activity_fifth_exercise);
        TextView text = (TextView) findViewById(R.id.tvLegRaiseLink);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
