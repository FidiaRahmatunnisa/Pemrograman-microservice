/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidia.produk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Fidya
 */
@Table
@Entity
public class Produk {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    
    private int id;
    private String kode;
    private String nama;
    private String satuan;

    public Produk() {
    }

    public Produk(int id, String kode, String nama, String satuan) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.satuan = satuan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
    
    @Override
    public String toString() {
        return "Produk{" + "id=" + id + ", kode=" + kode + ", nama=" + nama + ", satuan=" + satuan + '}';
    } 
            
}
