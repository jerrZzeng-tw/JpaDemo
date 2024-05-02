package com.example.jpademo.domian;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Entity
@Data
@Accessors(chain = true)
public class House  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String houseNumber;

    private String owner;

    private String idCard;

    public House() {
    }

    public House(String houseNumber, String owner, String idCard) {
        this.houseNumber = houseNumber;
        this.owner = owner;
        this.idCard = idCard;
    }
}