package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:登录人事管理界面
 * @author: ZPX
 * @createDate: 2020/1/13 20:01
 * @version: 1.0
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public  String gotoIndex(){
        return "index";
    }

}




