package controller;

import com.rest.component.PersonService;
import com.rest.controller.PersonController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(PowerMockRunner.class)
public class PersonControllerTest {

    private PersonService personService;

    @InjectMocks
    private PersonController personController;

    private MockMvc mockMvc;

    @Before
    public void setup() {

        // Process mock annotations
        personService = PowerMockito.mock(PersonService.class);
        MockitoAnnotations.initMocks(this);

        // Setup Spring test in standalone mode
        this.mockMvc = MockMvcBuilders.standaloneSetup(personController).build();

    }

    @Test
    public void testGetPersonRestEndpoint() throws Exception {

        ResultActions resultActions = this.mockMvc.perform(get("/data/person")
                .param("id", "15"));

        resultActions.andExpect(status().isOk());
    }
}
