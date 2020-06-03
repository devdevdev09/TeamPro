package com.study.team.project;

import java.util.HashMap;

import com.study.team.testVo.TestVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {

    private Logger logger = LoggerFactory.getLogger(indexController.class);

    @Autowired
    private IndexService indexService;
    
    @RequestMapping("/")
    public String index(){

        indexService.getIndex();
        return "index";
    }

    @RequestMapping("/test")
    public String index(@RequestParam HashMap<String,Object> param){
        logger.info("==========test controller==========");
        logger.debug("==========debug controller==========");
        System.out.println("============index param test============");
        System.out.println(param);

        return "index";
    }

    @RequestMapping("/default")
    public String defaultIndex(@RequestParam HashMap<String,Object> param){
        System.out.println("============index param test============");
        System.out.println(param);
        
        return "default/default";
    }

    @RequestMapping("/TestVo")
    public String testVo(TestVo testVo){
        System.out.println("============index param test============");
        System.out.println(testVo);
        
        return "default/test";
    }
    
}