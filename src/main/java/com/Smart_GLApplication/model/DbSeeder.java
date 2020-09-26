package com.Smart_GLApplication.model;

import com.Smart_GLApplication.model.AllItem;
import com.Smart_GLApplication.model.ItemDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private ItemDao itemDao;

    public DbSeeder(ItemDao itemDao){
        this.itemDao = itemDao;
    }

    @Override
    public void run(String... args) throws Exception {
        AllItem allItem1 = new AllItem(1, "carb1", "5kg", "citrus1");
        AllItem allItem2 = new AllItem(2, "carb2", "4kg", "citrus2");
        AllItem allItem3 = new AllItem(3, "carb3", "3kg", "citrus3");

        //delete all the allItems
        this.itemDao.deleteAll();

        //Add all allItems to
        List<AllItem> allItems = Arrays.asList(allItem1, allItem2, allItem3);
        this.itemDao.saveAll(allItems);
        System.out.println(itemDao.count());
    }
}
