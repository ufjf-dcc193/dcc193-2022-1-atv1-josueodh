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
        Jogador j = rep.getById(id);
        return j;
    }

}