package org.example.ApiApplication.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}

/*
*  Add Um registro:
*
curl -X POST http://localhost:8080/clientes \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Carlos Pereira",
    "email": "carlos@email.com",
    "telefone": "16999990004"
  }'
*
* */