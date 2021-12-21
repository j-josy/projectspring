package br.com.josseanevendetti.projectspring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping("/")

public class HomeController {
@GetMapping

public String home() {
return "Operação feita com sucesso" ;

    }
}

