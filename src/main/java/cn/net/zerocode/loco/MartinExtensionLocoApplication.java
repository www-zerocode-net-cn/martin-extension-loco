package cn.net.zerocode.loco;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liangcan
 * @version: 1.0
 * @date: 2022/11/21 16:34
 * @describtion: MartinExtensionLocoApplication
 */
@RestController
@SpringBootApplication
@MapperScan("cn.net.zerocode.loco.mapper")
@ComponentScan(basePackages = {"cn.net.zerocode.loco.*", "com.java2e.martin.common.core"})
public class MartinExtensionLocoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MartinExtensionLocoApplication.class, args);
    }

    @GetMapping("/test1")
    public String test(){
        return "test";
    }
}
