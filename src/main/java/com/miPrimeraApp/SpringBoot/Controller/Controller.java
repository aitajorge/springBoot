package com.miPrimeraApp.SpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
         
    
    
    @GetMapping ("/hola/{nombre}/{apellido}/{edad}")   
    public String decirHola(@PathVariable String nombre,  
                            @PathVariable String apellido,
                            @PathVariable int edad) {           
        return "Hola mundo " + nombre + " apellido: " + apellido + " Edad: " + edad;        
    } 
    
    @GetMapping ("/chau")
    public String decirChau(@RequestParam String nombre,
                            @RequestParam String apellido,
                            @RequestParam int edad) {
        return "Chau Mundo " + nombre + " apellido: " + apellido + " Edad: " + edad;
    }
    
    
    
}

