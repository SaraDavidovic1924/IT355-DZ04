/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.model;

/**
 *
 * @author doppe_000
 */
public class Nekretnine {

    private int brObjekta;
    private String adresa;
    private int br;
    private int kvadratura;
    private int datum;

    public Nekretnine() {

    }

    public Nekretnine(int brObjekta, String adresa, int br, int kvadratura, int datum) {
        this.brObjekta = brObjekta;
        this.adresa = adresa;
        this.br = br;
        this.kvadratura = kvadratura;
        this.datum = datum;
    }

    public int getBrObjekta() {
        return brObjekta;
    }

    public void setBrObjekta(int brObjekta) {
        this.brObjekta = brObjekta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public int getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(int kvadratura) {
        this.kvadratura = kvadratura;
    }

    public int getDatum() {
        return datum;
    }

    public void setDatum(int datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Nekretnine{" + "brObjekta=" + brObjekta + ", adresa=" + adresa + ", br=" + br + ", kvadratura=" + kvadratura + ", datum=" + datum + '}';
    }

}
