package scalable.tasks.Task6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task6")
public class Task6Contorller {

    @Value("${name}")
    String name;

    @Value("${id}")
    String id;

    @GetMapping("/hello")
    public String hello() {
        return "Hello " + name+" "+id;
    }
}
