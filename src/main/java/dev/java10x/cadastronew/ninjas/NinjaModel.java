package dev.java10x.Cadastronew.ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_ninjas")
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

}
