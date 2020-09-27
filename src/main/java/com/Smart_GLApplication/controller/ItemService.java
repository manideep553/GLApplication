
package com.Smart_GLApplication.controller;

import com.Smart_GLApplication.model.AllItem;
import com.Smart_GLApplication.model.ItemDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemService  {

    private ItemDao itemRepo;

//    public ItemService(ItemDao itemRepo) {
//        this.itemRepo = itemRepo;
//    }

    public List<AllItem> getAllItems() {
        List<AllItem> lis =  itemRepo.findAll();
        return lis;
    }

    public int insertItem(AllItem item) {
        item.setStatus("req");
        if(itemRepo.existsById(item.getName())){
           itemRepo.save(item);
           return 1;
        }else{
            itemRepo.save(item);
            return 1;
        }
    }

    public List<AllItem> getReqItems() {
        List<AllItem> reqItems = itemRepo.findByStatus("req");
        return reqItems;
    }
    //todo: check the status and if it is in req state than only change to all state
    public int changeItemStatus(AllItem item) {
        AllItem curItem = itemRepo.findByName(item.getName());
        if(curItem.getStatus() == "req"){
            curItem.setStatus("all");
            itemRepo.save(curItem);
            return 1;
        }
        return 0;
    }

//    public int updateItem(AllItem itemRepo) {
//        if(reqItemsList.containsKey(itemRepo.getName())){
//            AllItem curItem = reqItemsList.get(itemRepo.getName());
//            curItem.setQuantity(itemRepo.getQuantity());
//            curItem.setCompany(itemRepo.getCompany());
//            return 1;
//        }
//        return 0;
//    }


}

