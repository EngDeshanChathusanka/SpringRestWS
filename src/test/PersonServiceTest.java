import com.rest.Person;
import com.rest.component.PersonService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonServiceTest {

    @Test
    public void getPersonTest() {
        PersonService personService = new PersonService();
        Person person = personService.getPerson(15);
        assertEquals(15, person.getId());
    }
}
