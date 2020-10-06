package ZipCodeHW;
import org.junit.Assert;
import org.junit.Test;


public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person(1, "Dallas");
        Assert.assertEquals(1, person.getId());
        Assert.assertEquals("Dallas" ,person.getName());
    }
    @Test
    public void testSetName(){
        Person person = new Person(1, "dall");
        person.setName("Dallas");
        Assert.assertEquals("Dallas", person.getName());
    }











}
