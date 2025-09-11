package com.manjinder.notification_service.service;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
    private RedisTemplate redisTemplate;

    public RedisService(RedisTemplate redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    public void set(String template, int templatePriority){

    }
}
