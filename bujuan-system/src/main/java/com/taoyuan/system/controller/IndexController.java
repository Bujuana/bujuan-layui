package com.taoyuan.system.controller;

import com.taoyuan.framework.common.resp.Result;
import com.taoyuan.system.service.SysMenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.login.LoginContext;

@Controller
@AllArgsConstructor
public class IndexController {

    private final SysMenuService sysMenuService;

    @GetMapping("/")
    @ResponseBody
    public String welCome() {
        return "WelCome to Bujuan-Layui";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
