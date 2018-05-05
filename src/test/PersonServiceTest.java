
import com.rest.Account;
import com.rest.Person;
import com.rest.component.DBManager;
import com.rest.component.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DBManager.class})
public class PersonServiceTest {
    @Before
    public void setup() {
        PowerMockito.mockStatic(DBManager.class);
    }

    @Test
    public void getPersonTest() {
        when(DBManager.getAccount(anyString())).thenAnswer(new Answer<Account>() {
            @Override
            public Account answer(InvocationOnMock invocationOnMock) throws Throwable {
                String name = (String) invocationOnMock.getArguments()[0];
                Account account = new Account();
                account.setName(name);
                account.setAccountNo("1234");
                account.setBank("commercial");
                account.setBranch("Ambalantota");
                return account;
            }
        });

        PersonService personService = new PersonService();
        Person person = personService.getPerson(15);
        assertEquals(15, person.getId());
    }

    @Test
    public void privateGetInstance() throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        PersonService personService = new PersonService();

        Method method = PersonService.class.getDeclaredMethod("getInstance", String.class);
        method.setAccessible(true);
        String name = "Deshan";
        Person person = (Person) method.invoke(personService, name);

    }
}
