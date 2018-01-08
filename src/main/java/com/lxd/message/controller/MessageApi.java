package com.lxd.message.controller;

import com.lxd.message.dto.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by liaoxudong
 * Date:2018/1/4
 */

@RestController
@RequestMapping("/message")
public class MessageApi {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @PostMapping("/send")
    public void sendMessage(@RequestBody Map<String,String> params){
        String data = params.get("data");
        simpMessagingTemplate.convertAndSend("/topic/greetings",new Greeting(data));
    }
}
