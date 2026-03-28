package ma.ens.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController // 1. INDISPENSABLE pour que Spring gère cette classe
public class HelloController {

    @GetMapping("/hello") // 2. DÉFINIT L'URL d'accès (ex: http://localhost:8080/hello)
    public Map<String, String> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Bienvenue Mr LACHGAR sur votre application Spring Boot dockerisée");
        response.put("version", "1.0");
        return response;
    }
}
