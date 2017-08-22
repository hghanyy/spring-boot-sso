package com.oauth.sso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

@SpringBootApplication
@ComponentScan("com.oauth.sso")
@MapperScan("com.oauth.sso.mapper")
public class LoginApplication implements ServletContainerInitializer {
    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }


    @Override
    public void onStartup(Set<Class<?>> c, ServletContext servletContext) throws ServletException {
        servletContext.getSessionCookieConfig().setName("SESSIONID");
    }
}
