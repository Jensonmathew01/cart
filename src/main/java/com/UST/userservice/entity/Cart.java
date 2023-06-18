package com.UST.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer pid;
    private  String pname;
    private  String pcolour;
    private Long psize;
    private Long productid;




}
