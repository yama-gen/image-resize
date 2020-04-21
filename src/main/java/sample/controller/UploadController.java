package sample.controller;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
public class UploadController {

    @PostMapping
    public String upload(@RequestBody MultiValueMap data) {
        System.out.println(data);
        return "Hello Spring MVC";
    }
}
