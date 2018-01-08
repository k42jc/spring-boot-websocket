package com.lxd.message.dto;

/**
 * Created by liaoxudong
 * Date:2018/1/4
 */

public class HelloMessage {

    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
