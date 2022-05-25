package br.ufjf.dcc193.atividade05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository rep;

    Jogador create(Jogador jogador) {
        rep.save(jogador);
        return jogador;
    }

    List<Jogador> findAll() {
        return rep.findAll();
    }

    void delete(Long id) {
        rep.deleteById(id);
    }

    Jogador show(Long id) {
        Jogador j = rep.findById(id).get();

        return j;
    }

    Jogador update(Long id, Jogador jogador) {
        Jogador j = rep.findById(id).get();
        j.setNome(jogador.getNome());
        j.setTime(jogador.getTime());
        rep.save(j);
        return j;
    }

    Jogador increment(Long id, String type) {
        Jogador j = rep.findById(id).get();
        if (type.equals("ataques")) {
            j.setAtaques(j.getAtaques() + 1);
        } else if (type.equals("bloqueios")) {
            j.setBloqueios(j.getBloqueios() + 1);
        } else if (type.equals("pontos")) {
            j.setPontos(j.getPontos() + 1);
        } else if (type.equals("saques")) {
            j.setSaques(j.getSaques() + 1);
        }
        rep.save(j);
        return j;
    }

    Jogador decrement(Long id, String type) {
        Jogador j = rep.findById(id).get();
        if (type.equals("ataques") && j.getAtaques() > 0) {
            j.setAtaques(j.getAtaques() - 1);
        } else if (type.equals("bloqueios") && j.getBloqueios() > 0) {
            j.setBloqueios(j.getBloqueios() - 1);
        } else if (type.equals("pontos") && j.getPontos() > 0) {
            j.setPontos(j.getPontos() - 1);
        } else if (type.equals("saques") && j.getSaques() > 0) {
            j.setSaques(j.getSaques() - 1);
        }
        rep.save(j);
        return j;
    }

}