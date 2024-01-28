package cn.net.zerocode.loco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liangcan
 * @version: 1.0
 * @date: 2022/11/23 09:52
 * @describtion: TestController
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
