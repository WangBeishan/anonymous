package ml.sunmonkey.anonymousapi.controller;

import ml.sunmonkey.anonymousapi.model.Content;
import ml.sunmonkey.anonymousapi.model.User;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @MessageMapping("/join")
    @SendTo("/topic")
    @ResponseBody
    public String broadcastUser(String username) {
        return "「" + username +  "」，加入聊天室";
    }

    @MessageMapping("/disconnect")
    @SendTo("/topic")
    public String logout() {
        return "「 wbs 」，退出聊天室";
    }

    @MessageMapping("/send")
    @SendTo("/topic")
    @ResponseBody
    public User sendMessage(User message) {
        return message;
    }
}
