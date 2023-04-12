package com.ecommerce.crud.operation.ecommerce.Repsoistory;

import com.ecommerce.crud.operation.ecommerce.Entity.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface Repo extends JpaRepository<UserInformation,Integer> {
    Optional<UserInformation> findByEmail(String email);

}
