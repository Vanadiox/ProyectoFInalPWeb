/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pfinal.ProyectoFinal.miServicio;

import org.springframework.stereotype.Service;

/**
 *
 * @author olivier
 */

@Service
public class servicioXS {
    
  public String  validar(String nombre, String pass){
  
  String mensaje;
  if(nombre.equals("Calamarino") && pass.equals("123456")){
      mensaje = "Bienvenido";
  
  }else{
  
  mensaje = "CREDENCIALES INCORRECTAS XD";
  }
  
  return mensaje;
  
  
  }  
    
  
  
}
