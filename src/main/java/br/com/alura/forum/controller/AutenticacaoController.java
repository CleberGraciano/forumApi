package br.com.alura.forum.controller;

import br.com.alura.forum.controller.form.LoginForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

    @PostMapping
    public ResponseEntity<?> autenticar(@RequestBody @Valid LoginForm form){

        System.out.println(form.getEmail());
        System.out.println(form.getSenha());

        return ResponseEntity.ok().build();

    }
}
