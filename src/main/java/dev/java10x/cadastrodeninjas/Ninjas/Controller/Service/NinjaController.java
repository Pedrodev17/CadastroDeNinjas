package dev.java10x.cadastrodeninjas.Ninjas.Controller.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Bem-vindo ao Cadastro de Ninjas!";
    }

}
