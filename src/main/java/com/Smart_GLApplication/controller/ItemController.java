package com.Smart_GLApplication.controller;

import com.Smart_GLApplication.model.AllItem;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController{

    private ItemService itemService;

    public ItemController(ItemService item) {
        this.itemService = item;
    }

    @PutMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE)
    public int insertItem(@RequestBody AllItem item) {
        item.setStatus("req");
        return itemService.insertItem(item);
    }

    //todo: if items list is 0 handle the exception
    @GetMapping(value = "/allitems")
    public List<AllItem> getAllItems() {
        List<AllItem> lis =  this.itemService.getAllItems();
        return lis;
    }
    @GetMapping(value = "/reqitems")
    public List<AllItem> getAllReqItems() {
        return itemService.getReqItems();
    }

    @RequestMapping(value = "/delete/{item}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int deleteItem(@PathVariable  AllItem item) {
        return itemService.changeItemStatus(item);
    }
//    @RequestMapping(value = "/update",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public int updateItem(@RequestBody AllItem item) {
//        return itemService.updateItem(item);
//    }

}
