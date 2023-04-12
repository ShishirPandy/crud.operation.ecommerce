package com.ecommerce.crud.operation.ecommerce.Repsoistory;

import com.ecommerce.crud.operation.ecommerce.Entity.Shipped;
import com.ecommerce.crud.operation.ecommerce.Entity.UserInformation;
import com.ecommerce.crud.operation.ecommerce.Entity.cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface shippedd extends JpaRepository<Shipped,Integer> {
    Optional<cart> findByEmail(String email);
    @Query("Select SUM(i.price) from cart i where email=:useremail")
    public int total(@Param("useremail") final String useremail);}
