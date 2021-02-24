package com.deni.springbackend.controller;


import com.deni.springbackend.model.Users;
import com.deni.springbackend.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UsersController {

    @Autowired
    private UsersServices usersServices;

    // ambil data
    @GetMapping("/users")
    public List<Users> getUsers(){
        return usersServices.listUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<Users> findByIdUsers(@PathVariable  Long id){
        return   usersServices.FindById(id);
    }

    // tambah data users
    @PostMapping("/users/add")
    public void tambahUsers(@RequestBody Users users){
        usersServices.tambahUsers(users);
    }


    // ambil data atau edit
    @PutMapping("/users/edit/{id}")
    public void updateUsers(@PathVariable("id") Long id, @RequestBody Users users){
        usersServices.updateTeman(users);
    }

    // hapus data
    @DeleteMapping("/users/delete/{id}")
    public void deleteUsers(@PathVariable("id") Long id){
        usersServices.hapusTeman(id);
    }

}