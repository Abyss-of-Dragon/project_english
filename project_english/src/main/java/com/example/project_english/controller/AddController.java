package com.example.project_english.controller;

import com.example.project_english.bean.User;
import com.example.project_english.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AddController {
    @Autowired
    AddService addService;
    @Autowired
    Word_2021Service word_2021Service;
    @Autowired
    UserService userService;
    @Autowired
    AreaService areaService;
    @Autowired
    IrverbService irverbService;
    @Autowired
    MonthService monthService;
    @Autowired
    NumeralService numeralService;
    @Autowired
    WeekService weekService;
    @Autowired
    Word_sService word_sService;

    @RequestMapping("/addWord")
    public ModelAndView addWord(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            String Weng=request.getParameter("Weng");
            String Wpar=request.getParameter("Wpar");
            String Wchi=request.getParameter("Wchi");
            addService.addWord(Weng,Wpar,Wchi);
            if(Weng!=null){
                mav.setViewName("mainpage");
                mav.addObject("word_2021",word_2021Service.getAllWord_2021());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("mainpage");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("addWord");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/addArea")
    public ModelAndView addArea(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            String area=request.getParameter("area");
            String lang=request.getParameter("lang");
            String natnl=request.getParameter("natnl");
            String natnlty=request.getParameter("natnlty");
            addService.addArea(area,lang,natnl,natnlty);
            if(area!=null){
                mav.setViewName("guojia");
                mav.addObject("area",areaService.getAllArea());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("guojia");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("addArea");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/addIrverb")
    public ModelAndView addIrverb(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            String infin=request.getParameter("infin");
            String pastT=request.getParameter("pastT");
            String pastP=request.getParameter("pastP");
            addService.addIrverb(infin,pastT,pastP);
            if(infin!=null){
                mav.setViewName("dongci");
                mav.addObject("irverb",irverbService.getAllIrverb());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("dongci");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("addIrverb");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/addMonth")
    public ModelAndView addMonth(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            String month=request.getParameter("month");
            String month_abb=request.getParameter("month_abb");
            addService.addMonth(month,month_abb);
            if(month!=null){
                mav.setViewName("monthandweek");
                mav.addObject("month",monthService.getAllMonth());
                mav.addObject("week",weekService.getAllWeek());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("monthandweek");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("addMonth");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/addNumeral")
    public ModelAndView addNumeral(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            String cardinal=request.getParameter("cardinal");
            String ord_abb=request.getParameter("ord_abb");
            String ord_num=request.getParameter("ord_num");
            addService.addNumeral(cardinal,ord_abb,ord_num);
            if(cardinal!=null){
                mav.setViewName("shuci");
                mav.addObject("numeral",numeralService.getAllNumeral());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("shuci");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("addNumeral");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/addWeek")
    public ModelAndView addWeek(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            String day=request.getParameter("day");
            String day_abb=request.getParameter("day");
            addService.addWeek(day,day_abb);
            if(day!=null){
                mav.setViewName("monthandweek");
                mav.addObject("month",monthService.getAllMonth());
                mav.addObject("week",weekService.getAllWeek());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("monthandweek");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("addWeek");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/addWord_s")
    public ModelAndView addWord_s(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id = Integer.valueOf(request.getParameter("Id"));
            addService.addWord_s(Id);
            if(Id!=null){
                mav.setViewName("shoucang");
                mav.addObject("word_s",word_sService.getAllWord_s());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("shoucang");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("addWord_s");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }
}