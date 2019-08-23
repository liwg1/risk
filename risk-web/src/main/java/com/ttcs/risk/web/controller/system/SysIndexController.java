package com.ttcs.risk.web.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description TODO
 * @Author lwg43210@163.com
 * @Date 2019年08月22 23点48分35秒
 **/
@Controller
public class SysIndexController {
    //首页
    @GetMapping("/index")
    public String index(ModelMap mmap) {
        return "index";
    }
}
