package com.Smart_GLApplication.Test;

import com.Smart_GLApplication.controller.ItemController;
import com.Smart_GLApplication.controller.ItemService;
import com.Smart_GLApplication.model.AllItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @MockBean
    private ItemService itemService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAllItemsTester() throws Exception{
        List<AllItem> al = new ArrayList<>();
        AllItem aI = new AllItem();
        aI.setId(1234);
        aI.setStatus("avail");
    }
}
