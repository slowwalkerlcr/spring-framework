package com.lvcr.spring.demo.service;

/**
 * @description
 * @author: changrong_lv
 * @version: 1.0
 * @date: 2020/1/20 15:19
 */
public class MessageServiceImpl implements MessageService{
    @Override
    public String getMessage() {
        return "hello world";
    }
}
