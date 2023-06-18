package com.UST.userservice.VO;

import com.UST.userservice.entity.Cart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private Cart cart;
    private  Product product;

}
