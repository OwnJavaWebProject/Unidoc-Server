package com.sixth.unidoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class RedirectController {
    @GetMapping("/adminpage")
    public String adminPage() {
        return "admin";
    }

    @GetMapping("/daohang")
    public String daohangPage() {
        return "daohang";
    }

    @GetMapping("/my")
    public String myPage() {
        return "my";
    }

    @GetMapping("/mydoc")
    public String mydoc() {
        return "mydoc";
    }

    @GetMapping("/people")
    public String peoplePage() {
        return "people";
    }

    @GetMapping("/quanxian")
    public String quanxianPage() {
        return "quanxian";
    }

    @GetMapping("/editor")
    public void editorPage(HttpServletResponse response) {
        try {
            response.sendRedirect("http://45.76.222.93:9001/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/teamdoc")
    public String teamdocPage() {
        return "teamdoc";
    }

}
