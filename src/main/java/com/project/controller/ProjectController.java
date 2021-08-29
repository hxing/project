package com.project.controller;

import com.project.common.vo.BaseReq;
import com.project.service.ProjectService;
import com.project.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;



//@SpringBootApplication
//@ResponseBody
@RestController
@RequestMapping(value = "/project")
public class ProjectController {
//
    @Autowired
    private ProjectService projectService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/service/question")
    public String getQuestion (@RequestBody BaseReq req) {
        return projectService.question(req);
    }

    @RequestMapping("/service/answer")
    public String getAnswer (@RequestBody BaseReq req) {
        projectLogOut("answer",req);
        return projectService.answer(req);
    }

    @RequestMapping("/user/login")
    public String tryLogin (@RequestBody BaseReq req) {
        projectLogOut("login",req);
        return userService.login(req);
    }

    private void projectLogOut (String serviceName , BaseReq req) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("");
        System.out.println("========== " + df.format(new Date()) + " === 接收到[ " + serviceName + " ]请求 " + " ==========");
//        System.out.println(df.format(new Date()) + " 接收到[ " + serviceName + " ]请求 ");
        System.out.println(df.format(new Date()) + " 请求体[ " + req + " ]");
    }

}
