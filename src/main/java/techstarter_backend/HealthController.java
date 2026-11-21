package techstarter_backend;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> health() {
        return Map.of(
            "status", "UP",
            "service", "techstarter-backend",
            "project", "TechStarter Day"
        );
    }

    @GetMapping("/event")
    public Map<String, Object> event() {
        return Map.of(
            "name", "TechStarter Day",
            "capacity", 40,
            "status" , "OPEN"
        );
    }
}

    