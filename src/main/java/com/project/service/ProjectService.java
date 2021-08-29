package com.project.service;

import com.project.common.vo.BaseReq;

public interface ProjectService {

    String question(BaseReq req);

    String answer(BaseReq req);
}
