package controller;

import com.rest.controller.DetailController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by deshan on 3/12/2018.
 */

@RunWith(PowerMockRunner.class)
public class DetailControllerTest {

    @InjectMocks
    private DetailController detailController;

    private MockMvc mockMvc;

    @Before
    public void setup() {

        // Process mock annotations
        MockitoAnnotations.initMocks(this);

        // Setup Spring test in standalone mode
        this.mockMvc = MockMvcBuilders.standaloneSetup(detailController).build();

    }

    @Test
    public void testShow() throws Exception {

        ResultActions resultActions = this.mockMvc.perform(get("/product/test")
                .param("Test", "TestStr"));

        resultActions.andExpect(status().isOk());
    }


}
