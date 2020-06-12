package com.springboot.sessionredis.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

//@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 5) #设置session失效时间
public class SessionConfig {
}
