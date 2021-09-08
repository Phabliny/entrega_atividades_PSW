package br.edu.iftm.atividade3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Atividade {

    @RequestMapping("/atividade3")
    public String numero(Model modelo){
        System.out.println("----------> Passei por aqui");
        return "bootstrap"; 
    }
}