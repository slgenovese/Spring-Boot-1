/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miaplicacion.primerproyecto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sgenovese
 */

@RestController
public class HolaController {
    @GetMapping("/hola")
    public String decirHola(@RequestParam String nombre,
                            @RequestParam int edad, 
                            @RequestParam String profesion){
        return "Hola Mundo. Tu nombre es: " + nombre +", tu edad es: " + edad +
                ", tu profesion es: " + profesion;
    }
    @PostMapping("/cliente")
    public String nuevoCliente(){
        return "Chau";
    }
}
