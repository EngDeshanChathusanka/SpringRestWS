import com.rest.Person;
import com.rest.component.PersonService;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class PersonServiceTest {

    @Test
    public void getPersonTest() {
        PersonService personService = new PersonService();
        Person person = personService.getPerson(15);
        assertEquals(15, person.getId());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void privateCountLetters() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        PersonService personService = new PersonService();

        Method method = PersonService.class.getDeclaredMethod("getInstance");
        method.setAccessible(true);
        Person person = (Person) method.invoke(personService);

    }
}
