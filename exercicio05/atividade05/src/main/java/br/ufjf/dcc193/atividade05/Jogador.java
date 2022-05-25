package br.ufjf.dcc193.atividade05;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.domain.ExampleMatcher.NullHandler;

@Entity
public class Jogador {
    private String nome;
    private String time;
    private Integer ataques;
    private Integer bloqueios;
    private Integer saques;
    private Integer pontos;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Jogador() {
        this(null, null);

    }

    public Jogador(String nome, String time) {
        this.nome = nome;
        this.time = time;
        this.ataques = 0;
        this.bloqueios = 0;
        this.pontos = 0;
        this.saques = 0;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Jogador [ataques=" + ataques + ", bloqueios=" + bloqueios + ", id=" + id + ", nome=" + nome
                + ", pontos=" + pontos + ", saques=" + saques + ", time=" + time + "]";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getAtaques() {
        return ataques;
    }

    public void setAtaques(Integer ataques) {
        this.ataques = ataques;
    }

    public Integer getBloqueios() {
        return bloqueios;
    }

    public void setBloqueios(Integer bloqueios) {
        this.bloqueios = bloqueios;
    }

    public Integer getSaques() {
        return saques;
    }

    public void setSaques(Integer saques) {
        this.saques = saques;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
