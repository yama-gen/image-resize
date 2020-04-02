package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "")
    public String index() {
        return "index";
    }

    @PostMapping(value = "")
    public String post(@RequestParam MultipartFile image) {
        return "index";
    }
}
