/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidia.OrderSer.controller;

import com.fidia.OrderSer.entity.Order;
import com.fidia.OrderSer.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fidya
 */
@RestController
@RequestMapping("api/v1/Order")
public class OrderController {
    
    @Autowired
    private OrderService OrderService;
    
    @GetMapping
    public List<Order> getAll(){
        return OrderService.getAll();
    }
    
    @PostMapping
    public void insert(@RequestBody Order order){
        OrderService.insert(order);
    }
}
