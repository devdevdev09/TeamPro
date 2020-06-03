package com.study.team.project;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class IndexService {
    
    @Autowired
    private IndexMapper indexMapper;

    public void getIndex(){
        indexMapper.getIndex();
    }

}