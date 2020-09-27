package com.Smart_GLApplication.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDao extends MongoRepository<AllItem, String> {

  List<AllItem> findAll();
  List<AllItem> findByStatus(String status);
  AllItem findByName(String Name);

    /*int insertItem(AllItem item);

    List<AllItem> getAllItems();
    List<AllItem> getAllReqItems();
*/
  /*  int deleteItem(AllItem item);
    int updateItem(AllItem item);
  */



}
