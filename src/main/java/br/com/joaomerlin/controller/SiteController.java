package br.com.joaomerlin.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Joao on 10/07/2017.
 */

@Controller
@RequestMapping
public class SiteController {

    @GetMapping
    @Cacheable("index")
    public String index() {
        return "index";
    }

    @GetMapping("experiencia")
    @Cacheable("experiencia")
    public String experiencia() {
        return "experiencia";
    }

    @GetMapping("contato")
    @Cacheable("contato")
    public String contato() {
        return "contato";
    }

    @GetMapping("blog")
    @Cacheable("blog")
    public String blog() {
        return "blog";
    }
}
