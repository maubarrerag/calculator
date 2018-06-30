package com.aws.calculator.os;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="os")
public class OS {

    @Id
    @GeneratedValue
    private int nid;
    private String description;
}
