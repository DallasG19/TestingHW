package ZipCodeHW;

public interface ITeacher {
    public void teach(ILearner learner, double numberOfHours);
    public double lecture(ILearner[] learners, double numberOfHours);
}
