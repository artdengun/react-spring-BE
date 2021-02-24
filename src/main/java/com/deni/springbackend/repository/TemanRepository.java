package com.deni.springbackend.repository;

import com.deni.springbackend.model.Teman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemanRepository  extends JpaRepository<Teman, String> {
}
