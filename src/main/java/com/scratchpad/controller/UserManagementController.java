package com.scratchpad.controller;

import com.scratchpad.entity.UserDetails;
import com.scratchpad.manager.UserDetailsManagementManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usermanagement")
public class UserManagementController {

    @Autowired
    UserDetailsManagementManager userDetailsManagementManager;

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public ResponseEntity add(@RequestParam("name") String userName, @RequestParam("phone") String phone,
                              @RequestParam("password") String password) {

        UserDetails userDetails = new UserDetails();
        userDetails.setName(userName);
        userDetails.setPhone(phone);
        userDetails.setPassword(password);
        userDetailsManagementManager.add(userDetails);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<UserDetails> findAll() {
        List<UserDetails> userDetails = userDetailsManagementManager.findAll();
        return userDetails;
    }



    /*@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestParam("id") long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/logout/{id}", method = RequestMethod.POST)
    public ResponseEntity logout() {
        return new ResponseEntity<>(HttpStatus.OK);
    }*/
}
