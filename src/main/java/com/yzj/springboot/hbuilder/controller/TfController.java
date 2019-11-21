package com.yzj.springboot.hbuilder.controller;

import com.yzj.springboot.hbuilder.entity.High;
import com.yzj.springboot.hbuilder.entity.Junior;
import com.yzj.springboot.hbuilder.entity.Log;
import com.yzj.springboot.hbuilder.entity.Uni;
import com.yzj.springboot.hbuilder.service.HighService;
import com.yzj.springboot.hbuilder.service.JuniorService;
import com.yzj.springboot.hbuilder.service.LogService;
import com.yzj.springboot.hbuilder.service.UniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/20
 */

@Controller
public class TfController {

    String uname;

    @Autowired
    private LogService logService;

    @Autowired
    private JuniorService juniorService;

    @Autowired
    private HighService highService;

    @Autowired
    private UniService uniService;

//初始页
    @RequestMapping("/hello")
    public String hello(Model model){

        return "index";
    }
    //内容主页
    @RequestMapping("/tomain")
    public String tomain(Model model){

        return "main";
    }
//登陆
    @RequestMapping("/tologin")
    public String toLogin(String username, String password, HttpSession session){

        Log log = new Log();
        log.setUsername(username);
        log.setPassword(password);
        int a = logService.toLogin(log);
        this.uname = username;

        if(a>0){
            return "main";
        }

        return "index";
    }

//初中
    @RequestMapping("/cz")
    public String cz(Model model){
        List<Junior> jun = juniorService.getAllJunior();
        model.addAttribute("jun",jun);
        return "cz";
    }
    //    高中
    @RequestMapping("/gz")
    public String gz(Model model){
        List<High> high = highService.getAllHigh();
        model.addAttribute("high",high);
        return "gz";
    }
    //    大学
    @RequestMapping("/dx")
    public String dx(Model model){
        List<Uni> uni = uniService.getAllUni();
        model.addAttribute("uni",uni);
        return "dx";
    }
//    音乐
    @RequestMapping("/yy")
    public String yy(Model model){

        return "yy";
    }
//    动漫
    @RequestMapping("/dm")
    public String dm(Model model){

        return "dm";
    }

    @RequestMapping("/text")
    public String text(Model model){

        return "text";
    }

}
