/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidia.produk.service;

import com.fidia.produk.entity.Produk;
import com.fidia.produk.repository.ProdukRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Fidya
 */
@Service
public class ProdukService {
    
  @Autowired
  private ProdukRepository productRepository;

    @GetMapping
    public List<Produk> getAll(){
        return productRepository.findAll();
    } 
    
    public Produk getProduct(Long id){
        return productRepository.findById(id).get();
    }
    
  
    public Produk getProductById(Long productId){
        return productRepository.findById(productId).get();

    }
    
    public void insert(Produk product){
        productRepository.save(product);
    }
    
    @Transactional
    public void update(Long productId, String kode, String nama, String satuan, double harga){
        Produk product = productRepository.findById(productId)
                .orElseThrow(
                        () -> new IllegalStateException("Product Tidak ada")
                );
        if(kode != null && kode.length()>0
            && !Objects.equals(product.getKode(), kode)){
        product.setKode(kode);
        }
        if(nama != null && nama.length()>0
                && !Objects.equals(product.getNama(), nama)){
            product.setNama(nama);
        }
        if(satuan != null && satuan.length()>0
                && !Objects.equals(product.getSatuan(), satuan)){
            product.setSatuan(satuan);
        }
        if(harga != 0
                && !Objects.equals(product.getHarga(), harga)){
            product.setHarga(harga);
        }
      }

     public void delete(Long productId){
         productRepository.deleteById(productId);
     }
    
//    public Produk getProduk(Long id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public Produk getProduk(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
