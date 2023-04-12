package com.ecommerce.crud.operation.ecommerce.ApiController;

import com.ecommerce.crud.operation.ecommerce.Entity.dELIVERYBOY;
import com.ecommerce.crud.operation.ecommerce.Service.UerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boy")
public class boy {
@Autowired
    private UerService uerService;
    @PostMapping("/add_d_boy")
    public ResponseEntity<String>upload_boy(@RequestBody dELIVERYBOY dboy){
        String msg=this.uerService.upload_boy(dboy);
        return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    }




}
