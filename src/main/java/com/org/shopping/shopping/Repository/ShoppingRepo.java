package com.org.shopping.shopping.Repository;

import com.org.shopping.shopping.model.ShoppingDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingRepo  extends MongoRepository<ShoppingDetails,Double> {
}
