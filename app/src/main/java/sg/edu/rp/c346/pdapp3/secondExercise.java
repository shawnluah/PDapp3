package sg.edu.rp.c346.pdapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class secondExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Plank");
        setContentView(R.layout.activity_second_exercise);
        TextView text = (TextView) findViewById(R.id.tvPlankLink);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
