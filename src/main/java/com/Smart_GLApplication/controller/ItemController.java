package com.Smart_GLApplication.controller;

import com.Smart_GLApplication.model.AllItem;
import com.Smart_GLApplication.model.ItemDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController{


    private ItemService item;

    public ItemController(ItemService item) {
        this.item = item;
    }

    //todo: if items list is 0 handle the exception
    @GetMapping(value = "/allitems")
    public List<AllItem> getAllItems() {
        List<AllItem> lis =  this.item.getAllItems();
//        System.out.println(item.count());
//        for(AllItem val : lis){
//            System.out.println(val.getName());
//        }
        return lis;
    }
//    @GetMapping(value = "/reqitems")
//    public List<AllItem> getAllReqItems() {
//        return itemService.getAllReqItems();
//    }
//
//    @RequestMapping(value = "/delete",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public int deleteItem(@RequestBody AllItem item) {
//        return itemService.deleteItem(item);
//    }
//    @RequestMapping(value = "/update",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public int updateItem(@RequestBody AllItem item) {
//        return itemService.updateItem(item);
//    }
//    @RequestMapping(value = "/insert",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public int insertItem(@RequestBody AllItem item) {
//        return itemService.insertItem(item);
//    }
}
