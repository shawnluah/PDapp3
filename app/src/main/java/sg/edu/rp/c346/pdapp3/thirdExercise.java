package sg.edu.rp.c346.pdapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class thirdExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Bench Press");
        setContentView(R.layout.activity_third_exercise);
        TextView text = (TextView) findViewById(R.id.tvBenchPressLink);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
