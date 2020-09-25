package com.Smart_GLApplication.controller;

import com.Smart_GLApplication.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDao extends MongoRepository<Item, String> {

    int insertItem(Item item);

    List<Item> getAllItems();
    List<Item> getAllReqItems();

    int deleteItem(Item item);
    int updateItem(Item item);

}
