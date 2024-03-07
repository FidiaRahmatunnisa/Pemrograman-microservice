/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidia.pembayaran.service;

import com.fidia.pembayaran.entity.Pembayaran;
import com.fidia.pembayaran.repository.PembayaranRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fidya
 */
@Service
public class PembayaranService {
   private final PembayaranRepository pembayaranRepository ;
    
    @Autowired
    public PembayaranService(PembayaranRepository pembayaranRepository) {
        this.pembayaranRepository = pembayaranRepository;
    }
    
    public List<Pembayaran> getAll(){
        return pembayaranRepository.findAll();
    }
    
    public Pembayaran getPembayaranById(Long id){
        return pembayaranRepository.getReferenceById(id);
    }
    
    public void insert(Pembayaran pembayaran){
     pembayaranRepository.save(pembayaran);
    }
    
    public void delete(Long id){
        pembayaranRepository.deleteById(id);
    }
    
    @Transactional
    public void update(Long id, Long order_id, String mode_pembayaran,int ref_number,String tgl_bayar, String status,double total){
      Pembayaran pembayaran = pembayaranRepository.findById(id).orElseThrow(()-> new IllegalStateException(" tidak ada"));
     
      if(mode_pembayaran!=null && mode_pembayaran.length()>0 &&pembayaran.getMode_pembayaran().equals(mode_pembayaran) ){
        pembayaran.setMode_pembayaran(tgl_bayar);
      }
      if(ref_number> 0 && pembayaran.getRef_number() != ref_number){
           pembayaran.setRef_number(ref_number);
       }
      if(tgl_bayar!=null && tgl_bayar.length()>0 &&pembayaran.getTgl_bayar().equals(tgl_bayar) ){
        pembayaran.setTgl_bayar(tgl_bayar);
      }
       if(status!=null && status.length()>0 &&pembayaran.getStatus().equals(status) ){
        pembayaran.setStatus(tgl_bayar);
      }
       if(total> 0 && pembayaran.getTotal() != total){
           pembayaran.setTotal(total);
       }
        
    } 

    
}
