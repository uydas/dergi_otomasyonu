/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Lenovo
 */
public class Kullanicilar {

    private int id;
    private int role;
    private String kullanıcıadı;
    private String sifre;
    private String isim;
    private String soyisim;
    private String mail;
    private String dogumtarihi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getKullanıcıadı() {
        return kullanıcıadı;
    }

    public void setKullanıcıadı(String kullanıcıadı) {
        this.kullanıcıadı = kullanıcıadı;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }
}
