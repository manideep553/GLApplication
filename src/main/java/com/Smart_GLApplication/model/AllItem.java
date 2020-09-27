package com.Smart_GLApplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "AllItems")
public class AllItem {

    private int id;
    @Id
    private String name;

    @Indexed(direction = IndexDirection.ASCENDING)
    private String quantity;
    private String company;
    private String status;

    public AllItem(@JsonProperty("id") int id,
                   @JsonProperty("name") String name,
                   @JsonProperty("quality") String quantity,
                   @JsonProperty("company") String company,
                   @JsonProperty("status") String status){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.company = company;
        this.status = status;
    }



    public AllItem(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
