package com.study.team.project.index;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.study.team.vo.testVo.TestVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Controller
public class indexController {

    private Logger logger = LoggerFactory.getLogger(indexController.class);

    @Autowired
    private IndexService indexService;

    @Value("${server.port}")
    private String strvalue;
    
    
    @RequestMapping("/")
    public String index(Model model){
        logger.debug("test", "Testtttt~~~~~~~");
        logger.debug("value~~~", strvalue);

        List<HashMap<String, String>> list = indexService.getIndex();

        model.addAttribute("list", list);

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