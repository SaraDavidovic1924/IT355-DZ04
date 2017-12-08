/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.dao.impl;

import com.metropolitan.it355.dao.NekretnineDao;

/**
 *
 * @author Saryca
 */
public class NekretnineDaoImpl implements NekretnineDao {

    @Override
    public void addNekretnine() {
        System.out.println("Adding student...");
    }

    @Override
    public String addNekretnineRet() {
        System.out.println("Adding student and returning value...");
        return "Added succesfully!";
    }

    @Override
    public void addNekretnineThrowException() throws Exception {
        System.out.println("Adding student and throwing exception...");
        throw new Exception("Generic Exception");
    }

    @Override
    public void addNekretnineAround(String name) {
        System.out.println("Adding student with name: " + name);
    }
}
