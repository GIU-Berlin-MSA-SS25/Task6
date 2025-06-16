package scalable.tasks.Task6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task6Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
