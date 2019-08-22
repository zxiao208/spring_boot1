package com.zhaoxiao.spring_boot1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author zhaoxiao
 */
@Controller
@RequestMapping("user")
public class LoginController {
    @Value("${imagepath}")
   private String imagePath;

    @RequestMapping("login")
    public @ResponseBody String Login(){
        return "niha"+imagePath;
    }
}
