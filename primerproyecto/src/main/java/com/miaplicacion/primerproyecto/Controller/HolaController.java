/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miaplicacion.primerproyecto.Controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sgenovese
 */

@RestController
public class HolaController {
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
    List<Cliente> listaClientes = new ArrayList<Cliente>();
    listaClientes.add(new Cliente(1,"Sergio","Genovese"));
    listaClientes.add(new Cliente(1,"Nestor","Rotela"));
    listaClientes.add(new Cliente(1,"Leandro","Rezzonico"));
    return listaClientes;
}

    @GetMapping("/pruebaresponse")
    ResponseEntity <String> traerRespuesta(){
        return new ResponseEntity<>("Este es un mensaje Response Entity ",HttpStatus.OK);  
    }


    @GetMapping("/hola")
    public String decirHola(@RequestParam String nombre,
                            @RequestParam int edad, 
                            @RequestParam String profesion){
        return "Hola Mundo. Tu nombre es: " + nombre +", tu edad es: " + edad +
                ", tu profesion es: " + profesion;
    }
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Datos Cliente: " + cli.getNombre()+ "Apellido: "+ cli.getApellido());
    }
}

