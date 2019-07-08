package sg.edu.rp.c346.pdapp3;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExerciseAdapter extends ArrayAdapter<Exercise> {
    private ArrayList<Exercise> exercises;
    private Context context;
    private TextView tvExerciseName, tvDescription;
    private ImageView ivExercise;

    public ExerciseAdapter(Context context, int resource, ArrayList<Exercise> objects){
        super(context, resource, objects);

        exercises = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);


        tvExerciseName = rowView.findViewById(R.id.tvName);
        tvDescription = rowView.findViewById(R.id.tvDescription);
        ivExercise = rowView.findViewById(R.id.iv);


        Exercise currentExercise = exercises.get(position);

        tvExerciseName.setText(currentExercise.getExercise());
        tvDescription.setText(currentExercise.getDescription());

        if (position == 0) {
            ivExercise.setImageResource(R.drawable.pushup);
        } else if (position == 1) {
            ivExercise.setImageResource(R.drawable.plank);
        } else if (position == 2) {
            ivExercise.setImageResource(R.drawable.benchpress);
        } else if (position == 3) {
            ivExercise.setImageResource(R.drawable.bicepscurl);
        } else {
            ivExercise.setImageResource(R.drawable.legraise);
        }


        return rowView;
    }


}
