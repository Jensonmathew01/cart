package com.UST.userservice.service;
import com.UST.userservice.VO.Product;
import com.UST.userservice.VO.ResponseTemplateVO;
import com.UST.userservice.entity.Cart;
import com.UST.userservice.repository.CartRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

    @Service
    @Slf4j
    public class CartService {
        @Autowired
        private  CartRepo cartRepo;
        @Autowired
        private  RestTemplate restTemplate;
//
//        @Autowired
//        public CartService(CartRepo cartRepo, RestTemplate restTemplate) {
//            this.cartRepo = cartRepo;
//            this.restTemplate = restTemplate;
//        }

        public Cart create(Cart cart) {
            log.info("hello");
            return cartRepo.save(cart);
        }

        public ResponseTemplateVO getUserWithDepartment(Integer id) {
            ResponseTemplateVO vo = new ResponseTemplateVO();
            Cart cart = cartRepo.findById(id).orElse(null);

            Product product = restTemplate.getForObject("http://localhost:9002/api/products/" + cart.getProductid(), Product.class);

            vo.setCart(cart);
            vo.setProduct(product);
            return vo;
        }

        public void deleteProduct(Integer id) {
            cartRepo.deleteById(id);
            log.info("he");
        }
    }


