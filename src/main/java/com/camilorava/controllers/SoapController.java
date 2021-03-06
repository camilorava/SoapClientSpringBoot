package com.camilorava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.camilorava.soap.SoapClient;

@RestController
@RequestMapping("/num2words")
public class SoapController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping("/{numero}")
    public String convertirNumeroPalabras(@PathVariable("numero") Long numero) {
        return soapClient.convertirNumeroPalabras(numero);
    }

}
