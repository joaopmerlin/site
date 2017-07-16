package br.com.joaomerlin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joao on 11/07/17.
 */

@RestController
@RequestMapping("email")
public class EmailController {

    @Autowired private MailSender mailSender;

    @PostMapping
    @Async
    public void send(@RequestParam String nome,
                     @RequestParam String email,
                     @RequestParam String mensagem){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("joao.p.merlin@gmail.com");
        simpleMailMessage.setSubject("Contato meu site");
        simpleMailMessage.setText("Nome: " + nome + "\nEmail: " + email + "\n\nMensagem: " + mensagem);
        mailSender.send(simpleMailMessage);
    }
}
