package test.java.com.samteejay.javaBook;

import main.java.com.samteejay.javaBook.Person;
import org.junit.Test;
import static org.junit.Assert.assertEquals ;



public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person person = new Person();
        assertEquals ( "Hello World" ,
                person.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus() {
        Person samuel = new Person();
        assertEquals ( "Hello Samuel" ,
                samuel.hello( "Samuel" ));
    }

    @ Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();
        assertEquals (3, myPerson.numberOfPersons());
    }


}
