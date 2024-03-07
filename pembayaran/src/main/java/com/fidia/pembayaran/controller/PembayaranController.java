/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidia.pembayaran.controller;

import com.fidia.pembayaran.entity.Pembayaran;
import com.fidia.pembayaran.service.PembayaranService;
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
@RequestMapping("api/v1/Pembayaran")
public class PembayaranController {
    
    @Autowired
    private PembayaranService PembayaranService;
    
    @GetMapping
    public List<Pembayaran> getAll(){
        return PembayaranService.getAll();
    }
    
    @PostMapping
    public void insert(@RequestBody Pembayaran pembayaran){
        PembayaranService.insert(pembayaran);
    }
}
