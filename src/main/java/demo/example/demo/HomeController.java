package demo.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    private  UserRepository userRepository;
    @GetMapping("/")
    public String home() {
        return "home.jsp";  // This will resolve to /WEB-INF/views/home.jsp
    }

    // Capture the form input 'a' and pass it to h1.jsp
    @GetMapping("/h1")
    public String h1(@RequestParam() String a, String b,Model model) {
        // Add 'a' to the model to be accessed in the JSP
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        return "h1.jsp";  // This will resolve to /WEB-INF/views/h1.jsp
    }
    @GetMapping("/getuser")
    public String getuser(Model model) {
        model.addAttribute("user",userRepository.findAll());
        return "user.jsp";
    }
    
    @GetMapping("/adduser")
    public String addUser(@RequestParam String id,@RequestParam String name,@RequestParam int phn,Model model) {
        User user=new User();
        user.setId(id);
        user.setName(name);
        user.setPhn(phn);
        userRepository.save(user);
        model.addAttribute("user", userRepository.findAll());

        return "user.jsp";
    }
    
}
