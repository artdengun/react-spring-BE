package com.deni.springbackend.controller;

import com.deni.springbackend.model.Teman;
import com.deni.springbackend.service.TemanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TemanController {

    @Autowired
    private TemanService temanService;


    @GetMapping("/teman")
    public List<Teman> getTemans(){
        return temanService.getTeman();
    }

    @PostMapping("/teman/tambahTeman")
    public void tambahTeman(@RequestBody Teman teman){
        temanService.tambahTeman(teman);
    }

    @PutMapping("/teman/{id}/edit")
    public void updateTeman(@PathVariable("id") String id, @RequestBody Teman teman){
        temanService.updateTeman(teman);
    }

    @DeleteMapping("/teman/{id}/hapus")
    public void hapusTeman(@PathVariable("id") String id){
        temanService.hapusTeman(id);
    }
}
