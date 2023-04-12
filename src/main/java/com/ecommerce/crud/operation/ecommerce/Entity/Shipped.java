package com.ecommerce.crud.operation.ecommerce.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Shipped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int a_id;
     private String cart_status="Not_shipped";
     private int total_price;
     private String email;
     private String address;
     @MapsId
     @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="delivery_boy_id",referencedColumnName = "id")
    private dELIVERYBOY deliveryboy;




}
