import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@RestController
@EnableAutoConfiguration
public class AppController {

    @RequestMapping("/hello")
    String home(Model model) {
        return "hello";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppController.class, args);
    }

}
