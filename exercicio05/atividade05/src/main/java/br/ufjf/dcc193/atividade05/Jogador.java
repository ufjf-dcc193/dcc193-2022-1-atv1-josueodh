package br.ufjf.dcc193.atividade05;

import javax.persistence.Entity;

@Entity
public class Jogador {
    private String nome;
    private String time;
    private Integer ataques;
    private Integer bloqueios;
    private Integer saques;
    private Integer pontos;

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

}
