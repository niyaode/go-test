package net.sdake;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
//@EnableJdbcHttpSession
@MapperScan(value = "net.sdake.oauthserver.mapper")//使用@MapperScan 批量标注注解版的mapper接口类，不用再接口类上使用@Mapper注解了
@SpringBootApplication
public class OauthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthServerApplication.class, args);
    }

}

