package ZipCodeHW;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(1, "Dallas");
        Assert.assertEquals(true, student instanceof ILearner);
    }
    @Test
    public void testInheritance(){
        Student student = new Student(1, "Dallas");
        Assert.assertEquals(true, student instanceof Person);
    }
    @Test
    public void testLearn(){
        Student student = new Student(1, "Dallas");
        student.learn(10);
        Assert.assertTrue("true", student.getTotalStudyTime() == 10);
    }





}
