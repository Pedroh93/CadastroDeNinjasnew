package dev.java10x.Cadastronew.ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasvindas(){
        return " essa é a primeira rota";
    }
}
