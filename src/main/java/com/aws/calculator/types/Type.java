package com.aws.calculator.types;

import com.aws.calculator.os.OS;
import com.aws.calculator.regions.Region;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="types")
public class Type {

    @Id
    @GeneratedValue
    private int nid;
    private String code;
    @OneToOne
    @JoinColumn(name="region")
    private Region region;
    private int vcpu;
    private double memory;
    private double ondemand;
    private double reserved;
    @OneToOne
    @JoinColumn(name="os")
    private OS os;


}
