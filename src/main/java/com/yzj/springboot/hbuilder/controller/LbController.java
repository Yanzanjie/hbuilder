package com.yzj.springboot.hbuilder.controller;

import com.yzj.springboot.hbuilder.entity.*;
import com.yzj.springboot.hbuilder.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 作者: yzj
 * 日期: 2019/11/5
 */
@RestController
@CrossOrigin
public class LbController {

    String uname;

    @Autowired
    private LbService lbService;

    @Autowired
    private JuniorService juniorService;

    @Autowired
    private UserService userService;

    @Autowired
    private HighService highService;

    @Autowired
    private UniService uniService;

    @Autowired
    private MusicService musicService;

    @Autowired
    private MhcService mhcService;

    @Autowired
    private LogService logService;

    @Autowired
    private DzService dzService;

    @Autowired
    private UlService ulService;

//    轮播
    @RequestMapping("/findalllb")
    public List<Lb> findAllLb(){
        return lbService.getToAll();
    }

//    初中
    @RequestMapping("/findalljunior")
    public List<Junior> findAllJunior(){
        return juniorService.getAllJunior();
    }

//    我的历程
    @RequestMapping("/findalluser")
    public List<User> findAllUser(){
        return userService.getAllUser();
    }

//    高中
    @RequestMapping("/findallhigh")
    public List<High> findAllHigh(){
        return highService.getAllHigh();
    }

//    大学
    @RequestMapping("/findalluni")
    public List<Uni> findAllUni(){
        return uniService.getAllUni();
    }

//    音乐
    @RequestMapping("/findallmusic")
    public List<Music> findAllMusic(){
        return musicService.getAllMusic();
    }
//    漫画
    @RequestMapping("/findallmhc")
    public List<Mhc> findAllMhc(){
        return mhcService.getAllMhc();
    }

//    点赞数
    @RequestMapping("/findalldz")
    public int findAllDz(){
        return ulService.findCount();
    }
//    查询该用户是否点赞
    @RequestMapping("/findul")
    public int findUl(){

        int a = logService.getUId(uname);
        int b = ulService.getLikeById(a);
        System.out.println(b);
        if(b == 1){
            return 1;
        }

        return 0;
    }

    //点赞时添加
    @RequestMapping("/findadddz")
    public int findAddDz(){
        int a = logService.getUId(uname);
        ulService.findAddDz(a);

        return 0;
    }

    //取消赞
    @RequestMapping("/finddeldz")
    public int findDelDz(){
        int a = logService.getUId(uname);
        ulService.findDelDz(a);

        return 0;
    }

//    登陆
    @RequestMapping("/tolog")
    public int toLog(String dlzh,String dlmm ,HttpSession session){
        Log log = new Log();
        log.setUsername(dlzh);
        log.setPassword(dlmm);
        int a = logService.toLogin(log);
        this.uname = dlzh;
        return a;
    }
//    注册
    @RequestMapping("/toreg")
    public int toReg(String zczh, String zcmm){
        Log log = new Log();
        log.setUsername(zczh);
        log.setPassword(zcmm);
        int a = logService.toReg(log);
        return a;
    }



}
