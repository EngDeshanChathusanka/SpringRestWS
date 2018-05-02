import com.rest.Person;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Spy
    Person person;

    @Before
    public void setup() {

        // Process mock annotations
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void setIdTest() {
        person.setId(15);
        assertEquals(15, person.getId());
    }

    @Test
    public void setNameTest() {
        person.setName("Deshan");
        assertEquals("Deshan", person.getName());
    }

    @Test
    public void setAgeTest() {
        person.setAge(25);
        assertEquals(25, person.getAge());
    }
}
