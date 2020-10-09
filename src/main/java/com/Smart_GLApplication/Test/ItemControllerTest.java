package com.Smart_GLApplication.Test;

import com.Smart_GLApplication.controller.ItemController;
import com.Smart_GLApplication.controller.ItemService;
import com.Smart_GLApplication.model.AllItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
        aI.setStatus("all");
        aI.setCompany("bakers kill");
        aI.setName("Bread");
        aI.setQuantity("20lb");
        al.add(aI);

        AllItem aI2 = new AllItem();
        aI2.setId(1235);
        aI2.setStatus("all");
        aI2.setCompany("bakers kill");
        aI2.setName("Bread2");
        aI2.setQuantity("30lb");
        al.add(aI2);
        given(itemService.getAllItems()).willReturn(al);
        this.mockMvc.perform(get("/item/allitems"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}
