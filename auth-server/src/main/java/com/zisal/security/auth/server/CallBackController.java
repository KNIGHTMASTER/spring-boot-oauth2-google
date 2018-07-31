package com.zisal.security.auth.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on Jul 31, 2018
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
public class CallBackController {

    @GetMapping("/callback")
    public String callback(){
        return "CallBack";
    }
}
