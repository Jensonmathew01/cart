package com.UST.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    //private Long id;
    private Long id;
    private String name;
    private Double price;
    private String image;

}

