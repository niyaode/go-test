package net.sdake.oauthserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2019/2/1
 * Time: 20:40
 */
@Controller
public class IndexController {



    @GetMapping({"","/","/index"})
    @ResponseBody
    public String index(){
        return "index";
    }

}
