package com.Smart_GLApplication.controller;

import com.Smart_GLApplication.model.Item;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;
import java.util.List;

public class dbSeeder implements CommandLineRunner {

    private ItemDao itemDao;

    public dbSeeder(ItemDao itemDao){
        this.itemDao = itemDao;
    }

    @Override
    public void run(String... args) throws Exception {
        Item item1 = new Item(1, "carb1", "5kg", "citrus1");
        Item item2 = new Item(2, "carb2", "4kg", "citrus2");
        Item item3 = new Item(3, "carb3", "3kg", "citrus3");

        //delete all the items
        this.itemDao.deleteAll();

        //Add all items to
        List<Item> items = Arrays.asList(item1, item2, item3);
        this.itemDao.saveAll(items);
    }
}
