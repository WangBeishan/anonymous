package ml.sunmonkey.anonymousapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class IndexController {

    @GetMapping("/ui/**")
    public ModelAndView ui() {
        return new ModelAndView("index.html");
    }

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("forward:ui");
    }
}
