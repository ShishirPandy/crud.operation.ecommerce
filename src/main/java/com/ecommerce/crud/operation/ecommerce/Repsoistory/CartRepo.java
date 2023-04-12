package com.ecommerce.crud.operation.ecommerce.Repsoistory;

import com.ecommerce.crud.operation.ecommerce.Entity.cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface CartRepo extends JpaRepository<cart,Integer> {

    List<cart> findAllByEmail(String email);
    @Transactional
    @Modifying
    @Query("Delete from cart i where i.email=:email")
    void delete(@Param("email")String email);

}
