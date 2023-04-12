package com.ecommerce.crud.operation.ecommerce.Repsoistory;

import com.ecommerce.crud.operation.ecommerce.Entity.dELIVERYBOY;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Delivery extends JpaRepository<dELIVERYBOY,Integer> {

    Optional<dELIVERYBOY> findByEmail(String email);
}
