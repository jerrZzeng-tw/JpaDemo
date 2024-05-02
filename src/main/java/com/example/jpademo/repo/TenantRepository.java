package com.example.jpademo.repo;

import com.example.jpademo.domian.Tenant;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface TenantRepository extends JpaRepository<Tenant, Long> {
    Page<Tenant> findAllByNameContaining(String name, Pageable page);

    Page<Tenant> findAllByIdCardContaining(String idCard, Pageable page);

    Tenant findFirstByMobile(String mobile);
    @RestResource(exported = false)
    Tenant findFirstByIdCard(String idCard);
    void deleteById(Long id);
}