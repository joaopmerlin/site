package br.com.joaomerlin.controller;

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
    public String home(){return "index";}
}
