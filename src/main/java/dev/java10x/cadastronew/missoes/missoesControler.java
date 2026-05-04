package dev.java10x.cadastronew.missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class missoesControler {
    //get
    @GetMapping ("/listar")
    public  String ListarMissao(){
        return"missoes listadas";
    }
    @PostMapping("/criar")
    public String criarMissao(){
        return "missao criada";
    }
    @PutMapping ("/alterar")
        public String alterarMissao(){
            return "alterar missao";
        }
     @DeleteMapping("/delete")
    public  String deletarMissao(){
        return "missao deletada";
     }
    }

