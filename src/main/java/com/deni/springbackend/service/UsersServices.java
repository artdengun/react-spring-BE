package com.deni.springbackend.service;

import com.deni.springbackend.model.Users;
import com.deni.springbackend.repository.TemanRepository;
import com.deni.springbackend.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsersServices {

    @Autowired
    private UsersRepository user;

    @Transactional
    public List<Users> listUsers(){
        return user.findAll();
    }

    @Transactional
    public Optional<Users> FindById(Long id){
       return user.findById(id);
    }

    @Transactional
    public void tambahUsers(Users users){
       user.save(users);
    }

    @Transactional
    public void updateTeman(Users users) {
        user.save(users);
    }

    @Transactional
    public void hapusTeman(Long id){
        user.deleteById(id);
    }

}
