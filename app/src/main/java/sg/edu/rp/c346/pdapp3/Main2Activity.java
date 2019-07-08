package sg.edu.rp.c346.pdapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Exercise> exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Exercise List");

        lv = findViewById(R.id.lv);

        exercise = new ArrayList<Exercise>();
        exercise.add(new Exercise("Push Up", "The push-up is a very common strength training exercise that is used by an array of individuals interested in improving their strength, including members of the military, bodybuilders and general fitness participants. Completing push-ups is effective at developing upper body strength. There are options that all strength levels can incorporate to make the exercise easier or more difficult."));
        exercise.add(new Exercise("Plank", "The plank is an excellent abdominal and core exercise. It works not only the rectus abdominis, but also the other ab muscles and the core muscles that run from the pelvis along the spine and up to the shoulder girdle. To ensure you keep your core strong and stable, add the plank to your ab workout program."));
        exercise.add(new Exercise("Bench Press", "The bench press is an upper-body weight training exercise in which the trainee presses a weight upwards while lying on a weight training bench. The exercise uses the pectoralis major, the anterior deltoids, and the triceps, among other stabilizing muscles. A barbell is generally used to hold the weight, but a pair of dumbbells can also be used."));
        exercise.add(new Exercise("Bicep Curl", "Bicep Curls are a low stress movement to develop strength in the upper body. Bicep Curls strengthen the elbow flexors namely the two bicep muscles and brachioradialis (forearm muscle)."));
        exercise.add(new Exercise("Leg Raise", "The leg raise is a strength training exercise which targets the iliopsoas (the anterior hip flexors). Because the abdominal muscles are used isometrically to stabilize the body during the motion, leg raises are also often used to strengthen the rectus abdominis muscle and the internal and external oblique muscles. "));

        aa = new ExerciseAdapter(this, R.layout.row, exercise);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(Main2Activity.this, firstExercise.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i2 = new Intent(Main2Activity.this, secondExercise.class);
                    startActivity(i2);
                } else if (position == 2) {
                    Intent i3 = new Intent(Main2Activity.this, thirdExercise.class);
                    startActivity(i3);
                } else if (position == 3) {
                    Intent i4 = new Intent(Main2Activity.this, fourthExercise.class);
                    startActivity(i4);
                } else if (position == 4) {
                    Intent i5 = new Intent(Main2Activity.this, fifthExercise.class);
                    startActivity(i5);
                }
            }
        });
    }
}
