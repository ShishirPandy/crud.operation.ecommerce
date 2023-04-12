package com.ecommerce.crud.operation.ecommerce.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class UserInformation {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
    private String username;
    private String email;

}
