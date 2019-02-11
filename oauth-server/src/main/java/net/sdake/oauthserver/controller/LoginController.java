package net.sdake.oauthserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2019/1/26
 * Time: 14:42
 */
@Controller
public class LoginController {

    @GetMapping({"/login"})
    public String login(){
        return "material/login/index";
    }

}
