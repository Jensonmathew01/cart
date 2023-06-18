package com.UST.userservice.controller;

import com.UST.userservice.VO.ResponseTemplateVO;
import com.UST.userservice.entity.Cart;
import com.UST.userservice.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
@Slf4j
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/addproduct")
    public ResponseEntity<Cart> create(@RequestBody Cart add) {
        log.info("hello");
        Cart savedCart = cartService.create(add);
        return ResponseEntity.ok().body(savedCart);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepart(@PathVariable Integer id) {
        return cartService.getUserWithDepartment(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteproduct(@PathVariable Integer id) {
        cartService.deleteProduct(id);
        log.info("he");
        return ResponseEntity.ok().build();
    }
}
