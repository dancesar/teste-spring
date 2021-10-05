package com.dancesar.testespring.controller;

import com.dancesar.testespring.model.Endereco;
import com.dancesar.testespring.repository.EnderecoRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Api(tags = "Endereço")
@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("/consulta-por-cnpj")
    public Optional<Endereco> consultaPorCnpj(@RequestParam("cnpj") String cnpj){
        return enderecoRepository.findByCnpj(cnpj);
    }

    @PostMapping("/media")
    public Double mediaNumero(Double num1, Double num2){
        Double media;

        return media = (num1 + num2) / 2;
    }
}
