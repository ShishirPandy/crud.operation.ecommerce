package com.ecommerce.crud.operation.ecommerce.ApiController;

import com.ecommerce.crud.operation.ecommerce.Entity.UserInformation;
import com.ecommerce.crud.operation.ecommerce.Service.UerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")

public class Api {
    @Autowired
    private UerService uerService;
    @PostMapping("/adduser")
   public ResponseEntity<String>addUser(@RequestBody  UserInformation userInformation){
        String msg=this.uerService.addUser(userInformation);
        return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    }
    @GetMapping("/gett")
    public ResponseEntity<List>getAll(){
        List<UserInformation> userInformation = this.uerService.GetAll();
        return new ResponseEntity<>(userInformation, HttpStatus.OK);
    }

}
