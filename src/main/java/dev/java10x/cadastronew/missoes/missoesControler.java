package dev.java10x.cadastronew.missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class missoesControler {
    @Autowired
    private missoesService missoesService;

    @GetMapping("/listar")
    public List<missoesModel> ListarMissao() {
        return missoesService.listarMissoes();
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

