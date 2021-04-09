package com.org.shopping.shopping.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class ShoppingDetails {
    @Id
    private double Expenditure;
    private String Name;
    private String Address;
    private double Mobilenumber;
}
