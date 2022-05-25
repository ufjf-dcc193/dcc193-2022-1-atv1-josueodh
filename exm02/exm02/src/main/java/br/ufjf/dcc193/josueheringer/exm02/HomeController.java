package br.ufjf.dcc193.josueheringer.exm02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    @Autowired
    PessoaService ps;

    @RequestMapping({ "", "index.html" })
    public String home() {
        return "home";
    }

    @RequestMapping({ "formulario", "formulario.html" })
    public String formulario() {
        return "form/formulario";
    }

    @RequestMapping({ "resultado", "resultado.html" })
    public RedirectView resultado(Pessoa pessoa) {
        ps.cadastrar(pessoa);
        return new RedirectView("pessoas.html");
    }

    @RequestMapping("pessoas.html")
    public ModelAndView resultado() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pessoas");
        List<Pessoa> pl = ps.listaTodos();
        System.out.println(pl);
        mv.addObject("pessoas", pl);
        return mv;
    }

    @RequestMapping({ "excluir", "excluir.html" })
    public RedirectView excluir(@RequestParam Long id) {
        try {
            ps.deletar(id);
        } catch (Exception e) {
            return new RedirectView("error.html");
        }
        return new RedirectView("pessoas.html");
    }

    @RequestMapping({ "visualizar", "visualizar.html" })
    public ModelAndView visualizar(@RequestParam Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("visualizar");
        Pessoa p = ps.detalhe(id);
        mv.addObject("pessoa", p);
        return mv;
    }

    @RequestMapping({ "editar", "editar.html" })
    public ModelAndView editar(@RequestParam Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editar");
        try {
            Pessoa p = ps.detalhe(id);
            mv.addObject("pessoa", p);
            return mv;
        } catch (Exception e) {
            mv.setViewName("error");
            return mv;
        }

    }

    @RequestMapping({ "atualizar", "atualizar.html" })
    public RedirectView atualizar(Pessoa pessoa, @RequestParam Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pessoas");
        ps.autualizar(id, pessoa);
        return new RedirectView("pessoas.html");

    }
}
