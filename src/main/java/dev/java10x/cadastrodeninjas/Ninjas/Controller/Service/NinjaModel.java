package dev.java10x.cadastrodeninjas.Ninjas.Controller.Service;
import dev.java10x.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "tb_cadastro")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

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


