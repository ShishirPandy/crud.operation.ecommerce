package com.ecommerce.crud.operation.ecommerce.ApiController;

import com.ecommerce.crud.operation.ecommerce.Entity.Shipped;
import com.ecommerce.crud.operation.ecommerce.Service.UerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipped")
public class Shippedapi {

    @Autowired
    private UerService uerService;
    @GetMapping("/dispatched")
    public ResponseEntity<String> ship(@RequestParam("email") String email,@RequestParam("address") String address,@RequestParam("id")Integer id) {
        String msg=this.uerService.ship(email,address,id);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }









}
