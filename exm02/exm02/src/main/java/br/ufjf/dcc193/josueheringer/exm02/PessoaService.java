package br.ufjf.dcc193.josueheringer.exm02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository rep;

    List<Pessoa> listaTodos() {
        return rep.findAll();
    }

    void deletar(Long id) {
        rep.deleteById(id);
    }

    Pessoa cadastrar(Pessoa pessoa) {
        rep.save(pessoa);
        return pessoa;
    }

    Pessoa detalhe(Long id) {
        Pessoa p = rep.getById(id);
        return p;
    }

    Pessoa autualizar(Long id, Pessoa pessoa) {
        Pessoa p = rep.getById(id);
        p.setNome(pessoa.getNome());
        p.setIdade(pessoa.getIdade());
        rep.save(p);
        return p;
    }

}
