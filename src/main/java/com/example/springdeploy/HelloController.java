package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //@Value("${app.varexample}")
    @Value("${app.message}")
    String message;

    @GetMapping("/hola")
    public String holaMundo(){
        System.out.println(message);
        return "Hola mundo que tal vamos!!!! Hasta Luego";
    }

    @GetMapping("/")
    public String bootstrap(){
        //Se puede pero esto no es recomendable
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                  </head>
                  <body>
                    <h1>Hello, world from Sprint!!</h1>
                    <a class="btn btn-primary" href="https://www.google.com">Google <a/>
                  </body>
                </html>
                """;

    }
}
