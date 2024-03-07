/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidia.pembayaran.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Fidya
 */
@Entity
@Table(name="t_pembayaran")
public class Pembayaran {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Long id;
    private Long order_id;
    private String mode_pembayaran;
    private int ref_number;
    private String tgl_bayar;
    private String status;
    private double total;

    public Pembayaran() {
    }

    public Pembayaran(Long id, Long order_id, String mode_pembayaran, int ref_number, String tgl_bayar, String status, double total) {
        this.id = id;
        this.order_id = order_id;
        this.mode_pembayaran = mode_pembayaran;
        this.ref_number = ref_number;
        this.tgl_bayar = tgl_bayar;
        this.status = status;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getMode_pembayaran() {
        return mode_pembayaran;
    }

    public void setMode_pembayaran(String mode_pembayaran) {
        this.mode_pembayaran = mode_pembayaran;
    }

    public int getRef_number() {
        return ref_number;
    }

    public void setRef_number(int ref_number) {
        this.ref_number = ref_number;
    }

    public String getTgl_bayar() {
        return tgl_bayar;
    }

    public void setTgl_bayar(String tgl_bayar) {
        this.tgl_bayar = tgl_bayar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public String toString(){
        return "id : "+id+
                "order id : "+order_id+
                "mode pembayaran : "+mode_pembayaran+
                "ref number : "+ref_number+
                "tanggal bayar : "+tgl_bayar+
                "status : "+status+
                "total : "+status;
    }
    
    
}
