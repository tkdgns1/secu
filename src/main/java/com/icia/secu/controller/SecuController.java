package com.icia.secu.controller;

import com.icia.secu.dto.SecuDTO;
import com.icia.secu.service.SecuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecuController {
    private ModelAndView mav = new ModelAndView();

    @Autowired
    private SecuService svc;
    
    // 처음 실행 화면
    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    // 메인 페이지로 이동
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index1(){

        return "index";
    }
    @RequestMapping(value ="/join", method = RequestMethod.POST)
    public ModelAndView secuJoin(@ModelAttribute SecuDTO secu){
        mav = svc.secuJoin(secu);
        return mav;
    }
    @RequestMapping(value ="/login", method = RequestMethod.POST)
    public ModelAndView secuLogin(@ModelAttribute SecuDTO secu){
        mav = svc.secuLogin(secu);
        return mav;
    }
}
