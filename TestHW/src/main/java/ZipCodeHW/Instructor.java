package ZipCodeHW;

public class Instructor extends Person implements ITeacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(ILearner learner, double numberOfHours) {
            learner.learn(10);
    }

    @Override
    public double lecture(ILearner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        return  numberOfHoursPerLearner;
    }
}
