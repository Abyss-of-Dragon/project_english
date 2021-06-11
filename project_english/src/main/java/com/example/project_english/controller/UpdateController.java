package com.example.project_english.controller;

import com.example.project_english.bean.User;
import com.example.project_english.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class UpdateController {
    @Autowired
    UpdateService updateService;
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

    @RequestMapping("/updateWord")
    public ModelAndView updateWord(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            String Weng=request.getParameter("Weng");
            String Wpar=request.getParameter("Wpar");
            String Wchi=request.getParameter("Wchi");
            updateService.updateWord(Id,Weng,Wpar,Wchi);
            if(Id!=null){
                mav.setViewName("mainpage");
                mav.addObject("word_2021",word_2021Service.getAllWord_2021());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("mainpage");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("updateWord");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/updateArea")
    public ModelAndView updateArea(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            String area=request.getParameter("area");
            String lang=request.getParameter("lang");
            String natnl=request.getParameter("natnl");
            String natnlty=request.getParameter("natnlty");
            updateService.updateArea(Id,area,lang,natnl,natnlty);
            if(area!=null){
                mav.setViewName("guojia");
                mav.addObject("area",areaService.getAllArea());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("guojia");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("updateArea");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/updateIrverb")
    public ModelAndView updateIrverb(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            String infin=request.getParameter("infin");
            String pastT=request.getParameter("pastT");
            String pastP=request.getParameter("pastP");
            updateService.updateIrverb(Id,infin,pastT,pastP);
            if(infin!=null){
                mav.setViewName("dongci");
                mav.addObject("irverb",irverbService.getAllIrverb());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("dongci");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("updateIrverb");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/updateMonth")
    public ModelAndView updateMonth(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            String month=request.getParameter("month");
            String month_abb=request.getParameter("month_abb");
            updateService.updateMonth(Id,month,month_abb);
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
            mav.setViewName("updateMonth");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/updateNumeral")
    public ModelAndView updateNumeral(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            String cardinal=request.getParameter("cardinal");
            String ord_abb=request.getParameter("ord_abb");
            String ord_num=request.getParameter("ord_num");
            updateService.updateNumeral(Id,cardinal,ord_abb,ord_num);
            if(cardinal!=null){
                mav.setViewName("shuci");
                mav.addObject("numeral",numeralService.getAllNumeral());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("shuci");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("updateNumeral");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/updateWeek")
    public ModelAndView updateWeek(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            String day=request.getParameter("day");
            String day_abb=request.getParameter("day");
            updateService.updateWeek(Id,day,day_abb);
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
            mav.setViewName("updateWeek");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }
}
