package com.example.jpademo.domian;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
public class Tenant  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //隐私信息不需要暴露
    private String idCard;

    private String mobile;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime rentDateTime;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    private House house;

    public Tenant() {
    }

    public Tenant(String name, String idCard, String mobile, LocalDateTime rentDateTime, House hous) {
        this.name = name;
        this.idCard = idCard;
        this.mobile = mobile;
        this.rentDateTime = rentDateTime;
        this.house = hous;
    }
}