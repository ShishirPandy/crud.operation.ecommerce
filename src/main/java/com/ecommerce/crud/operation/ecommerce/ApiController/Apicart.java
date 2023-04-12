package com.ecommerce.crud.operation.ecommerce.ApiController;

import com.ecommerce.crud.operation.ecommerce.Entity.UserInformation;
import com.ecommerce.crud.operation.ecommerce.Entity.cart;
import com.ecommerce.crud.operation.ecommerce.Repsoistory.CartRepo;
import com.ecommerce.crud.operation.ecommerce.Service.UerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class Apicart {
    @Autowired
    private UerService uerService;

    private CartRepo cartRepo;
    @PostMapping("/upload_pro")
    public ResponseEntity<String>upload_prod(@RequestBody cart cart){
        String msg=this.uerService.upload_prod(cart);
        return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    }

    @GetMapping("/cart_detail")
    public ResponseEntity<List>get_cart_detail(){
        List<cart> c=this.uerService.get_cart_detail();
        return new ResponseEntity<>(c,HttpStatus.OK);
    }


}