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
    public NinjaModel mostrarPorId(@PathVariable long id){
        return ninjaService.ListarPorId(id);
    }
    //alterar dados
    @PutMapping("/alterar")
    public  String alterarNinjaPorId(){
        return "Alterar ninja por id";
    }
    //deletar
    @DeleteMapping("/deletar/{id}")
    public String deletarPorId(@PathVariable long id){
        return "ninja deletado pelo id";
    }

}
