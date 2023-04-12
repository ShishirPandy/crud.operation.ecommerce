package com.ecommerce.crud.operation.ecommerce.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="delivery")
@Getter
@Setter
public class dELIVERYBOY {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    private String boy_name;

    private String email;

    @OneToOne(mappedBy ="deliveryboy")
    private Shipped shipped;
 }
