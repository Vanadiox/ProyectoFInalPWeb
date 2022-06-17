/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pfinal.ProyectoFinal.controlador;

import com.pfinal.ProyectoFinal.miServicio.servicioXS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/parametros")
public class requestParamContr {
    
    private final servicioXS service;
    
    @Autowired
    
    public requestParamContr(servicioXS service){
    
        this.service = service ;
    
    }
    
    private static final String TEMPLATE_VIEW = "datos";
    private static final String TEMPLATE_VIEW2 = "redirect:/errorlog";
    
    @GetMapping("/request")
    public ModelAndView getRequest(@RequestParam(name="name") String nombreReq, @RequestParam(name="pass") String passReq){
    
    ModelAndView mav = new ModelAndView(TEMPLATE_VIEW);
    ModelAndView mavII = new ModelAndView(TEMPLATE_VIEW2);
    mav.addObject("dato_nombre", nombreReq);
    mav.addObject("dato_pass", passReq);
    mav.addObject("dato_mensaje", service.validar(nombreReq, passReq));
    String valorI = null;
    String valorII = service.validar(nombreReq, passReq);
    
    if(valorII.equals("Bienvenido")){
        
        return mav;
    }else{
    
    return mavII;
    }
    
    
    }
    
}
