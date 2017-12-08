package com.metropolitan.it355.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saryca
 */
public interface NekretnineDao {
public void addNekretnine();
public String addNekretnineRet();
public void addNekretnineThrowException() throws Exception;
public void addNekretnineAround(String name);
}