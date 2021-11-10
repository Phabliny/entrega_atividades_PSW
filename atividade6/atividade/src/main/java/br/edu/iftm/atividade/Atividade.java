package br.edu.iftm.atividade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Atividade {
    @RequestMapping("/")
    public String layout (Model modelo){
        System.out.println("Passei por aqui!!!");
        return "layout";
    }

    @RequestMapping("/pagina2")
    public String pagina2 (Model modelo){
        System.out.println("Passei por aqui!!!");
        return "pagina2";
    }
}
