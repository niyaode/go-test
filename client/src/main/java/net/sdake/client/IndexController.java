package net.sdake.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.AccessTokenRequest;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2019/2/10
 * Time: 13:51
 */
@RestController
public class IndexController {

    @Autowired
    private OAuth2RestTemplate restTemplate;

    @Qualifier("oauth2ClientContext")
    @Autowired
    private OAuth2ClientContext oAuth2ClientContext;

    @Autowired
    AccessTokenRequest accessTokenRequest;


    @RequestMapping("/login")
    public String login(String code){
        accessTokenRequest.setAuthorizationCode(code);
        return "redirect:/";
    }

    @RequestMapping("/index")
    public String index(){
        OAuth2AccessToken accessToken = oAuth2ClientContext.getAccessToken();
        AccessTokenRequest accessTokenRequest = oAuth2ClientContext.getAccessTokenRequest();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        WebAuthenticationDetails details = (WebAuthenticationDetails) authentication.getDetails();
        AccessTokenRequest request =
                restTemplate.getOAuth2ClientContext().getAccessTokenRequest();
        return "index";
    }

}
