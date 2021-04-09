package com.org.shopping.shopping.Controller;

import com.org.shopping.shopping.Repository.ShoppingRepo;
import com.org.shopping.shopping.model.ShoppingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping
@RestController
public class ShoppingCont {
    @Autowired
    public ShoppingRepo shoppingRepo;

    @PostMapping
    public void createshoppingrecord(@RequestBody ShoppingDetails shoppingDetails) {
        shoppingRepo.save(shoppingDetails);
    }
    @GetMapping
    public List<ShoppingDetails> allgetDetails(){
        List<ShoppingDetails> all = shoppingRepo.findAll();
        return all;
    }
}
