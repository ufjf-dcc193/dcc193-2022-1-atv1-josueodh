package br.ufjf.dcc193.atividade05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    JogadorService ps;

    @RequestMapping({ "", "home.html" })
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
        System.out.println(j.toString());
        ps.create(j);
        return new RedirectView("index.html");
    }

    @RequestMapping({ "index", "index.html" })
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        List<Jogador> pl = ps.findAll();
        System.out.println(pl);
        mv.addObject("jogadores", pl);
        return mv;
    }
}
