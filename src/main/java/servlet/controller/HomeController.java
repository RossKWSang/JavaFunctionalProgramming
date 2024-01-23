package servlet.controller;

import servlet.annotation.Controller;
import servlet.annotation.RequestMapping;
import servlet.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String Home(HttpServletRequest request, HttpServletResponse response) {
        return "home";
    }
}
