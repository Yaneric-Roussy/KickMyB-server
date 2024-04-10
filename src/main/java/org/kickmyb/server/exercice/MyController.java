package org.kickmyb.server.exercice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @GetMapping("/exerciceAjouterMot")
    public ResponseEntity<String> exerciceAjouterMot(){
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Warning", "499 - Ayoye");
        return ResponseEntity.badRequest()
                .headers(responseHeaders)
                .build();
    }

    @GetMapping("/exerciceAjouterMotRB")
    public @ResponseBody Error exerciceAjouterMotRB(){
        Error e = new Error();
        e.code = "499";
        e.message = "Ayoye";
        return e;
    }
}
