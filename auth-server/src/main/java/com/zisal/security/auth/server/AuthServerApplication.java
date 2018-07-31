package com.zisal.security.auth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created on Jul 31, 2018
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableOAuth2Sso
public class AuthServerApplication extends WebMvcConfigurerAdapter {
    
    public static void main(String [] args) {
        SpringApplication.run(AuthServerApplication.class);
    }
}
