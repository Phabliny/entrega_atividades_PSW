package br.edu.iftm.atividade1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Atividade {

    @RequestMapping("/atividade1")
    public String numero(Model modelo){
        modelo.addAttribute("num1", (int)(Math.random() * 100 ) + 1);
        modelo.addAttribute("num2", (int)(Math.random() * 100 ) + 1);
        modelo.addAttribute("num3", (int)(Math.random() * 100 ) + 1);
        modelo.addAttribute("num4", (int)(Math.random() * 100 ) + 1);
        modelo.addAttribute("num5", (int)(Math.random() * 100 ) + 1);
        modelo.addAttribute("num6", (int)(Math.random() * 100 ) + 1);
        return "numeros"; 
    }
}
