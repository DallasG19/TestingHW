package ZipCodeHW;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(1, "Dallas");
        Assert.assertEquals(true, instructor instanceof ITeacher);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(1,"Dallas");
        Assert.assertEquals(true, instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(1, "Dallas");
        Student student = new Student(1, "Dallas");
        instructor.teach(student, 10);
        Assert.assertTrue("true", student.getTotalStudyTime() == 10);
    }
    @Test
    public void TestLecture(){
        Instructor instructor = new Instructor(1, "Dallas");
        Student student1 = new Student(1, "Dallas");
        Student student2 = new Student(2, "Dall");
        Student student3 = new Student(3, "Dalla");
        ILearner[] students = {student1,student2,student3};
        Assert.assertTrue("true",instructor.lecture(students, 9) == 3);
    }
}
