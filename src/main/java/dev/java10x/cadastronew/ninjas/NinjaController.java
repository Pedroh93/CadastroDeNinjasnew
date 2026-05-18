package dev.java10x.cadastronew.ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")

public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return " essa é a primeira rota";
    }//add ninja
    @PostMapping ("/criar")
public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
    return ninjaService.criarNinja(ninja);
    }// mostrar todos os ninjas

    @GetMapping("/listar")  // ← deixar minúsculo para bater com a URL
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }
    @GetMapping("/all")
        public  String mostrarTodos(){
        return "ninja criado";
    }
    //MOSTRAR NINJAS POR ID
    @GetMapping("/allID")
    public  String mostrarTodosPorID(){
        return "ninja criado POR ID";
    }
        //read
    @GetMapping("/listar/{id}")
    public NinjaModel mostrarPorId(@PathVariable Long id){
        return ninjaService.listarPorId(id);
    }
    //alterar dados
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninja){
        return ninjaService.atualizarNinja(id, ninja);
    }
    //deletar
    @DeleteMapping("/deletar/{id}")
    public String deletarPorId(@PathVariable long id){
        ninjaService.deletarPorId(id);
        return "ninja deletado pelo id";
    }


}
