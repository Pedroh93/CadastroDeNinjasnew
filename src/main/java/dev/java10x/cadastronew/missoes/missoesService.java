package dev.java10x.cadastronew.missoes;

import dev.java10x.cadastronew.ninjas.NinjaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class missoesService {
    @Autowired
    private MissoesRepository missoesRepository;
    public List<missoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }
    public missoesModel ListarPorId(long id){
        Optional<missoesModel> missoesModel  =missoesRepository.findById(id);
        return missoesModel.orElse(null);
    }
    public missoesModel criarNinja(missoesModel missoes ){
        return missoesRepository.save(missoes);
    }
    public void deletarPorId(long id) {
        missoesRepository.deleteById(id);
    }
}
