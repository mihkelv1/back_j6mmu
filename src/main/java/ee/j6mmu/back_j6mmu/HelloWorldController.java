package ee.j6mmu.back_j6mmu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello/World")
    public String helloWorld(){
        return "HELLOOOO!!!!";

    }
}
