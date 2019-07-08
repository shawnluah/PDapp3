package sg.edu.rp.c346.pdapp3;

public class Exercise {
    private  String exercise;
    private String description;

    public Exercise(String exercise, String description) {
        this.exercise = exercise;
        this.description = description;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
