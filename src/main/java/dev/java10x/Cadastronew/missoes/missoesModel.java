package dev.java10x.Cadastronew.missoes;

import dev.java10x.Cadastronew.ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_misoses")
@NoArgsConstructor // cria os construtores vazios
@AllArgsConstructor // cria os construtores com argumento
@Data // cria os getter e os setter
public class missoesModel {
    @Id
   private long id;
 private    String nome;
    private String dificuldade;
    private NinjaModel ninja;

    // uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel>Ninjas;


}
