package br.ufjf.dcc193.atividade05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

    @Autowired
    JogadorService ps;

    @RequestMapping({ "", "index.html" })
    public String home() {
        return "home";
    }

    @RequestMapping({ "create", "create.html" })
    public String create() {
        return "create";
    }

    @RequestMapping({ "resultado", "resultado.html" })
    public RedirectView resultado(Jogador jogador) {
        Jogador j = new Jogador(jogador.getNome(), jogador.getTime());

        ps.create(j);
        return new RedirectView("jogadores.html");
    }
}
