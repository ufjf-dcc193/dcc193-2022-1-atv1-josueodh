package br.ufjf.dcc193.atividade05;

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
}