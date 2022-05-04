package br.ufjf.dcc193.josueheringer.exm02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping({ "", "index.html" })
    public String home() {
        return "home";
    }

    @RequestMapping({ "formulario", "formulario.html" })
    public String formulario() {
        return "form/formulario";
    }

    @RequestMapping({ "resultado", "resultado.html" })
    public ModelAndView resultado(String name, Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("form/resultado");
        mv.addObject("age", age);
        mv.addObject("name", name);
        return mv;
    }
}
