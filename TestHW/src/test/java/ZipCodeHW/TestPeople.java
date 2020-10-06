package ZipCodeHW;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void testAdd(){
        People people = new People();
        List<Person> personList = new ArrayList<>();
        Person person = new Person(1, "Dallas");
        personList.add(person);
        Assert.assertTrue("true", personList.contains(person));
    }
    @Test
    public void testRemove(){
        People people = new People();
        List<Person> personList = new ArrayList<>();
        Person person = new Person(1, "Dallas");
        personList.add(person);
        personList.remove(person);
        Assert.assertFalse("false", personList.contains(person));
    }
    @Test
    public void testFindById(){
        People people = new People();
        List<Person> personList = new ArrayList<>();
        Person person = new Person(1, "Dallas");
        personList.add(person);
        Assert.assertFalse("false", personList.contains(people));


    }
}
