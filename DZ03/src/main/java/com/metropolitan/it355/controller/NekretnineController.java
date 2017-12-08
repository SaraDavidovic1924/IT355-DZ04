/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.controller;

import com.metropolitan.it355.dao.NekretnineDao;
import com.metropolitan.it355.model.Nekretnine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NekretnineController {

    @Autowired
    private MessageSource messageSource;
    @Autowired
    private NekretnineDao nekretnineDao;

// GET method
    @RequestMapping(value = "/nekretnine", method = RequestMethod.GET)
    public ModelAndView nekretnine() {
        System.out.println("Calling MessageSource");

        System.out.println("Calling studentDao");
        nekretnineDao.addNekretnine();
        nekretnineDao.addNekretnineAround("Illegal argument");
        try {
            nekretnineDao.addNekretnineThrowException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("nekretnine", "command", new Nekretnine());
    }
// POST method

    @RequestMapping(value = "/addNekretnine", method = RequestMethod.POST)
    public String addNekretnine(@ModelAttribute Nekretnine nekretnine, ModelMap model) {
        model.addAttribute("brObjekta", nekretnine.getBrObjekta());
        model.addAttribute("adresa", nekretnine.getAdresa());
        model.addAttribute("br", nekretnine.getBr());
        model.addAttribute("kvadratura", nekretnine.getKvadratura());
        model.addAttribute("datum", nekretnine.getDatum());
// viewNekretnine.jsp
        return "viewNekretnine";
    }
}
