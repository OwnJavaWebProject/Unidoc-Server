package com.sixth.unidoc.controller;

import com.sixth.unidoc.domain.BrowserResponse;
import com.sixth.unidoc.domain.ServerSend;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public BrowserResponse say(ServerSend message) {
        return new BrowserResponse("Welcome, " + message.getName() + "!");
    }
}
