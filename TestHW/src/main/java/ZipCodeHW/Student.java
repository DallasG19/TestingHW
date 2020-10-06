package ZipCodeHW;

public class Student extends Person implements ILearner {
    private double totalStudyHours;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyHours = numberOfHours + totalStudyHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyHours;
    }

}
