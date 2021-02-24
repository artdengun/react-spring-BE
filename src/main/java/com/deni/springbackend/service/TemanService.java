package com.deni.springbackend.service;

import com.deni.springbackend.model.Teman;
import com.deni.springbackend.repository.TemanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemanService {

    @Autowired
    private TemanRepository repo;

    public List<Teman> getTeman(){
        return repo.findAll();
    }

    public void tambahTeman(Teman teman){
        repo.save(teman);
    }

    public void updateTeman(Teman teman){
        repo.save(teman);
    }

    public void hapusTeman(String id){
            repo.deleteById(id);
    }
}
