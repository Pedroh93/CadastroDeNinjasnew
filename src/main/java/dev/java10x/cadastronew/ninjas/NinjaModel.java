package dev.java10x.cadastronew.ninjas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import dev.java10x.cadastronew.missoes.missoesModel;

@Entity
@Table(name="tb_Ninjas")
@NoArgsConstructor // cria os construtores vazios
@AllArgsConstructor // cria os construtores com argumento
@Data // cria os getter e os setter
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Column(unique = true)
    private  String email;
    private  int idade;
    private String rank;
    @ManyToOne
    @JoinColumn(name = "missao_id")
    @JsonIgnore
  // ← adicionar aqui
    private missoesModel missoes;

}
