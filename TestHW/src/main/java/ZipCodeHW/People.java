package ZipCodeHW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    List<Person> personList = new ArrayList<>();




    public void add(Student student){

        personList.add(student);
    }

    public Person findById(long id){
        for (Person p: personList){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public boolean contains(Person person){
        boolean answer = false;
        for (Person p: personList){
            if (personList.contains(person)){
                answer = true;
            }
        }
        return answer;
    }
    public void remove(Person person){
        for (Person p: personList){
            if (personList.contains(person)){
                personList.remove(person);
            }
        }
    }
    public void remove(long id){
        for (Person p: personList){
            if (personList.contains(id)){
                personList.remove(id);
            }
        }
    }
    public void clearAll(){
        personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public Object[] toArray(){
        return personList.toArray();
    }


    public Iterator iterator(){


        return iterator();
    }
}
