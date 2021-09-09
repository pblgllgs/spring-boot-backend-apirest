package com.pblgllgs.spring.boot.backend.apirest.controllers;

import com.pblgllgs.spring.boot.backend.apirest.models.entity.Cliente;
import com.pblgllgs.spring.boot.backend.apirest.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }
    /*
    utilizamos @PathVariable ya que lo estamos pasando por url la id
     */
    @GetMapping("/clientes/{id}")
    public Cliente show(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    /*
    El cliente viene en formato json, por lo
    tanto debemos utilizar la anotación @RequestBody
    Devolvemos status 201
     */
    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }
}
