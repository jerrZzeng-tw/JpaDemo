package com.example.jpademo.domian;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobileAndName", types = {Tenant.class})
public interface TenantProjection {
    String getName();

    String getMobile();
}