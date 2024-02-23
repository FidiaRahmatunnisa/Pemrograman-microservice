/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidia.produk.service;

import com.fidia.produk.entity.Produk;
import com.fidia.produk.repository.ProdukRepository;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fidya
 */
@Service
public class ProdukService {
    
    private final ProdukRepository produkRepository ;
    
    @Autowired
    public ProdukService(ProdukRepository produkRepository) {
        this.produkRepository = produkRepository;
//        this.produkRepository = null;
    }
    
    public List<Produk> getAll(){
        return produkRepository.findAll();
    }
    
    public Produk getProduk(Long idproduk){
        return produkRepository.findById(idproduk).get();
    }
    
    public void insert(Produk produk){
        Optional<Produk> produkOptional = 
                produkRepository.findProdukByKode(produk.getKode());
        if(produkOptional.isPresent()){
            throw new IllegalStateException("kode sudah ada");
        }
        produkRepository.save(produk);
    }
    
    public void delete(Long produkId){
        boolean ada = produkRepository.existsById(produkId);
        if(!ada){
            throw new IllegalStateException("kode ini tidak ada");
        }
        produkRepository.deleteById(produkId);
    }
    
    public void update(Long produkId, String kode, String nama){
        Produk produk = produkRepository.findById(produkId)
                .orElseThrow(()->new IllegalStateException("nama tidak ada"));
        if(nama!=null && nama.length()>0 && !Objects.equals(produk.getNama(), nama)){
            produk.setNama(nama);
        }
        
        if(kode!=null && kode.length()>0 && !Objects.equals(produk.getKode(), kode)){
            Optional<Produk> produkOptional = produkRepository.findProdukByKode(kode);
            if(produkOptional.isPresent()){
                throw new IllegalStateException("kode sudah ada");
            }
            produk.setKode(kode);
        }
} 

    
}
