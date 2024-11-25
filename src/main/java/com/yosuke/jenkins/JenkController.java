package com.yosuke.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JenkController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @PostMapping("/send")
    public String send(Model model, @RequestParam(name = "text") String test) {
        System.out.println("入力：" + test);
        return "redirect:/";
    }
}
