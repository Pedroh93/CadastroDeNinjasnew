package dev.java10x.cadastronew.missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.cadastronew.ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class missoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ✅ adicionado
    private long id;

    private String nome;
    private String dificuldade;
    private  String email;
    @Column(name = "img_Url")
    private String imgUrl;
    @OneToMany(mappedBy = "missoes", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<NinjaModel> Ninjas;

    // ❌ Removi o campo "private NinjaModel ninja" — era ele causando o erro
}