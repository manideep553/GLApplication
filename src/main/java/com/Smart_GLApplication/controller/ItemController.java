package com.Smart_GLApplication.controller;

import com.Smart_GLApplication.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController{

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/insert",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int insertItem(@RequestBody Item item) {
        return itemService.insertItem(item);
    }

    @GetMapping(value = "/allitems")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    //todo: if items list is 0 handle the exception
    @GetMapping(value = "/reqitems")
    public List<Item> getAllReqItems() {
        return itemService.getAllReqItems();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int deleteItem(@RequestBody Item item) {
        return itemService.deleteItem(item);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int updateItem(@RequestBody Item item) {
        return itemService.updateItem(item);
    }

}
