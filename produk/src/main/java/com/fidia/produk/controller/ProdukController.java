/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidia.produk.controller;

import com.fidia.produk.entity.Produk;
import com.fidia.produk.service.ProdukService;
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
@RequestMapping("api/v1/Produk")
public class ProdukController {
    
    @Autowired
    private ProdukService Produkservice;
    
    @GetMapping
    public List<Produk> getAll(){
        return Produkservice.getAll();
    }
    
    @PostMapping
    public void insert(@RequestBody Produk produk){
        Produkservice.insert(produk);
    }
    
    
    
}
