package com.aws.calculator.regions;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="regions")

public class Region {
    @Id
    @GeneratedValue
    private int nid;
    private String code;
    private String description;


}

