package com.example.jpademo;

import com.example.jpademo.domian.House;
import com.example.jpademo.domian.Tenant;
import com.example.jpademo.repo.TenantRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaDemoApplication {
    @Resource
    private TenantRepository tenantRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }
    @PostConstruct
    public void initRepo() {
        //准备房子信息
        List<House> houses = new ArrayList<>();
        House zhangsan = new House("1101", "张三", "330521******1");
        House zhangsi = new House("1102", "张四", "330521******2");
        House zhangwu = new House("1103", "张五", "330521******3");
        House zhangliu = new House("1104", "张六", "330521******4");
        House zhangqi = new House("1105", "张七", "330521******5");
        House zhangba = new House("1106", "张八", "330521******6");
        //准备租客信息
        List<Tenant> tenants = new ArrayList<>();
        tenants.add(new Tenant("王一", "330522******1", "186****3331", LocalDateTime.now().minusDays(1), zhangsan));
        tenants.add(new Tenant("王二", "330522******2", "186****3332", LocalDateTime.now().minusDays(2), zhangsi));
        tenants.add(new Tenant("王三", "330522******3", "186****3333", LocalDateTime.now().minusDays(3), zhangwu));
        tenants.add(new Tenant("王四", "330522******4", "186****3334", LocalDateTime.now().minusDays(4), zhangliu));
        tenants.add(new Tenant("王五", "330522******5", "186****3335", LocalDateTime.now().minusDays(5), zhangqi));
        tenants.add(new Tenant("王六", "330522******6", "186****3336", LocalDateTime.now().minusDays(6), zhangba));
        tenantRepository.saveAll(tenants);
    }
}