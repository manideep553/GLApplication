package com.Smart_GLApplication.controller;

import com.Smart_GLApplication.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemService implements ItemDao {

    private static Map<String, Item> allItemsList;
    private static Map<String, Item> reqItemsList;
    private int id;

    public ItemService() {
        id = 0;
        allItemsList = new HashMap<>();
        reqItemsList = new HashMap<>();

        allItemsList.put("carb1", new Item(++id, "carb1", "5kg", "citrus1"));
        allItemsList.put("carb2", new Item(++id, "carb2", "4kg", "citrus2"));
        allItemsList.put("carb3", new Item(++id, "carb3", "3kg", "citrus3"));
    }

    @Override
    public int insertItem(Item item) {
        if(allItemsList.containsKey(item.getId())){
           reqItemsList.put(item.getName(), item);
            //item already present
            return 0;
        }else{
            item.setId(++id);
            allItemsList.put(item.getName(), item);
            reqItemsList.put(item.getName(), item);
            return 1;
        }
    }

    @Override
    public List<Item> getAllItems() {
        List<Item> allItems = new ArrayList<>();
        for(String key : allItemsList.keySet()){
            allItems.add(allItemsList.get(key));
        }
        return allItems;
    }

    @Override
    public List<Item> getAllReqItems() {
        List<Item> reqItems = new ArrayList<>();
        for(String key : reqItemsList.keySet()){
            reqItems.add(reqItemsList.get(key));
        }
        return reqItems;
    }

    @Override
    public int deleteItem(Item item) {
        if(reqItemsList.containsKey(item.getName())){
            reqItemsList.remove(item.getName());
            return 1;
        }
        return 0;
    }

    @Override
    public int updateItem(Item item) {
        if(reqItemsList.containsKey(item.getName())){
            Item curItem = reqItemsList.get(item.getName());
            curItem.setQuantity(item.getQuantity());
            curItem.setCompany(item.getCompany());
            return 1;
        }
        return 0;
    }
}
