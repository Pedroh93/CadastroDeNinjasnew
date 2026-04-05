package dev.java10x.Cadastronew;

import jakarta.persistence.*;

@Entity
@Table(name="tb_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private  String email;
    private  int idade;

    public NinjaModel() {
       ;
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
