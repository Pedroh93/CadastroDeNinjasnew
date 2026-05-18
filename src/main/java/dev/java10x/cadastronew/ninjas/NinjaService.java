package dev.java10x.cadastronew.ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  // ← adicionar
import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    @Autowired// faz os construtores

    private NinjaRepository ninjaRepository;
    // listar todos os ninjas
    public List <NinjaModel>listarNinjas(){
        return ninjaRepository.findAll();
    }
    public NinjaModel listarPorId(long id){
        Optional<NinjaModel> ninjaModel  =ninjaRepository.findById(id);
        return ninjaModel.orElse(null);
            }
            public NinjaModel criarNinja(NinjaModel ninja ){
        return ninjaRepository.save(ninja);
            }
            public void deletarPorId(long id) {
        ninjaRepository.deleteById(id);
            }
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null; // ou lançar uma exceção se não encontrar
    }

}
