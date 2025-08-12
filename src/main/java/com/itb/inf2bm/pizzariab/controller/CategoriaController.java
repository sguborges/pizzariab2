package com.itb.inf2bm.pizzariab.controller;

import com.itb.inf2bm.pizzariab.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    List<Categoria> categorias = new ArrayList<Categoria>();

    @GetMapping
    public List<Categoria> findAll() {

        Categoria c1 = new Categoria();
        c1.setId(1L);
        c1.setNome("Pepperoni");
        c1.setDescricao("Tipo a calabresa");
        c1.setCodStatus(true);

        categorias.add(c1);
        return categorias;
    }
}
