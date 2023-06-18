package com.UST.userservice.repository;

import com.UST.userservice.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart,Integer> {


    Cart findByPid(Long pid);
}
