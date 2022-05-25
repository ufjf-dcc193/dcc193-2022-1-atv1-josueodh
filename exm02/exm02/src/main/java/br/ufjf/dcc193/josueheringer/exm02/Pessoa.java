package br.ufjf.dcc193.josueheringer.exm02;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
    private String nome;
    private Integer idade;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Pessoa() {
        this(null, null);
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", idade=" + idade + ", nome=" + nome + "]";
    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
