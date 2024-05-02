package com.example.jpademo;

import com.example.jpademo.domian.Tenant;
import com.example.jpademo.repo.TenantRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class JpaController {
    @Resource
    private TenantRepository tenantRepository;
   @RequestMapping("/getTenant/{id}")
    public Tenant getTenant(@PathVariable Long id) {
       Tenant data =  tenantRepository.findAllById(Collections.singletonList(id)).getFirst();
       //data.getHouse();
       return data;
    }
}