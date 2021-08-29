package com.project.service.impl;

import com.project.common.vo.BaseReq;
import com.project.service.ProjectService;
import org.springframework.stereotype.Service;

//import java.util.logging.Logger;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Override
    public String question(BaseReq req){
        System.out.println("req ==>" + req);
        String resp = "what's your question?";
        return resp;
    }

    @Override
    public String answer(BaseReq req){
        System.out.println("req ==>" + req);
        String resp = "This is your answer.";
        return resp;
    }

}
