package com.ecommerce.crud.operation.ecommerce.Service;

import com.ecommerce.crud.operation.ecommerce.ApiController.Shippedapi;
import com.ecommerce.crud.operation.ecommerce.Entity.Shipped;
import com.ecommerce.crud.operation.ecommerce.Entity.UserInformation;
import com.ecommerce.crud.operation.ecommerce.Entity.cart;
import com.ecommerce.crud.operation.ecommerce.Entity.dELIVERYBOY;
import com.ecommerce.crud.operation.ecommerce.Repsoistory.CartRepo;
import com.ecommerce.crud.operation.ecommerce.Repsoistory.Delivery;
import com.ecommerce.crud.operation.ecommerce.Repsoistory.Repo;
import com.ecommerce.crud.operation.ecommerce.Repsoistory.shippedd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.metal.MetalBorders;
import java.util.List;
import java.util.Optional;

@Service
public class UerService {
    @Autowired
    private Repo repo;
    @Autowired
    private CartRepo cartRepo;
    @Autowired
    private shippedd ship;

    @Autowired
    private Delivery delivery;
    public String addUser(UserInformation userInformation){
        Optional<UserInformation> ans=this.repo.findByEmail(userInformation.getEmail());
        if (ans.isPresent()) {
            return "data already existed";
        } else {
            repo.save(userInformation);
            return "Data Added succesfully";
        }
    }
    public List GetAll() {
        List<UserInformation> a = repo.findAll();
        return a;
    }
    public List get_cart_detail(){
        List<cart>a=cartRepo.findAll();
        return a;
    }
    public String upload_prod(cart c){
        Optional<UserInformation> ans=this.repo.findByEmail(c.getEmail());
        if (!ans.isPresent()) {
            return "first register the user";
        } else {
            cartRepo.save(c);}

            return "Product Added succesfully";
    }
    public String ship(String email,String address,int id){
        List<cart> ans=this.cartRepo.findAllByEmail(email);
        if (ans==null) {
            return "first add the product";
        } else {
            int a= this.ship.total(email);

            Shipped ship_api=new Shipped();
            ship_api.setAddress(address);
            ship_api.setTotal_price(a);
            ship_api.setCart_status("Shipped");
            ship_api.setEmail(email);
            if(delivery.findById(id).isPresent()){
               dELIVERYBOY d_boy =delivery.findById(id).get();
                ship_api.setDeliveryboy(d_boy);
                this.ship.save(ship_api);
                this.cartRepo.delete(email);
            } else {
                return "delivery boy not present";
            }
        }

        return "Product is shipped";
    }
    public String upload_boy(dELIVERYBOY dboy){
        Optional<dELIVERYBOY> ans=this.delivery.findByEmail(dboy.getEmail());
        if (ans.isPresent()) {
            return "delivery boy data already existed";
        } else {
            delivery.save(dboy);
            return "Data Added succesfully";
        }
    }
    }
