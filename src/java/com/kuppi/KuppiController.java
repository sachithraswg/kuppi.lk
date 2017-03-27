/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuppi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
/**
 *
 * @author sachithra
 */
@Controller
public class KuppiController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String openIndex(ModelMap model){
        return "index";
    }
}
