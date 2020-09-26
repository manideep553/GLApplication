
package com.Smart_GLApplication.controller;

import com.Smart_GLApplication.model.AllItem;
import com.Smart_GLApplication.model.ItemDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemService  {

    private ItemDao item;

    public ItemService(ItemDao item) {
        this.item = item;
    }

    public List<AllItem> getAllItems() {
//        List<AllItem> allItems = itemDao.findAll();
//        for(String key : allItemsList.keySet()){
//            allItems.add(allItemsList.get(key));
//        }
        List<AllItem> lis =  item.findAll();

        return lis;
    }

    //    private static Map<String, AllItem> allItemsList;
//    private static Map<String, AllItem> reqItemsList;
//    private int id;
//
//    public ItemService() {
//        id = 0;
//        allItemsList = new HashMap<>();
//        reqItemsList = new HashMap<>();
//
//        allItemsList.put("carb1", new AllItem(++id, "carb1", "5kg", "citrus1"));
//        allItemsList.put("carb2", new AllItem(++id, "carb2", "4kg", "citrus2"));
//        allItemsList.put("carb3", new AllItem(++id, "carb3", "3kg", "citrus3"));
//    }


//    public int insertItem(AllItem item) {
//        if(allItemsList.containsKey(item.getId())){
//           reqItemsList.put(item.getName(), item);
//            //item already present
//            return 0;
//        }else{
//            item.setId(++id);
//            allItemsList.put(item.getName(), item);
//            reqItemsList.put(item.getName(), item);
//            return 1;
//        }
//    }





//    public List<AllItem> getAllReqItems() {
//        List<AllItem> reqItems = new ArrayList<>();
//        for(String key : reqItemsList.keySet()){
//            reqItems.add(reqItemsList.get(key));
//        }
//        return reqItems;
//    }


//    public int deleteItem(AllItem item) {
//        if(reqItemsList.containsKey(item.getName())){
//            reqItemsList.remove(item.getName());
//            return 1;
//        }
//        return 0;
//    }
//
//
//    public int updateItem(AllItem item) {
//        if(reqItemsList.containsKey(item.getName())){
//            AllItem curItem = reqItemsList.get(item.getName());
//            curItem.setQuantity(item.getQuantity());
//            curItem.setCompany(item.getCompany());
//            return 1;
//        }
//        return 0;
//    }
}

