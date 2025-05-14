package dev.java10x.cadastrodeninjas.Ninjas.Controller.Service;
import dev.java10x.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Table(name = "tb_cadastro")
@Entity
public class NinjaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private rivate Long id;

    private String nome;

    private String email;

    private int idade;

    @ManyToOne
    @joinColumn(name = "missoes_id")
    private MissoesModel missoes;

    public NinjaModel() {
    }


    public NinjaModel(String email, String nome, int idade) {
        this.email = email;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
