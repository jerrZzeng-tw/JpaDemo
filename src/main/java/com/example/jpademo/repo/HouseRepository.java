package com.example.jpademo.repo;

import com.example.jpademo.domian.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HouseRepository extends JpaRepository<House, Long> {
}