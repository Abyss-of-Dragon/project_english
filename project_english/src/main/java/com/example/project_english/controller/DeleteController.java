package com.example.project_english.controller;

import com.example.project_english.bean.User;
import com.example.project_english.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class DeleteController {
    @Autowired
    DeleteService deleteService;
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

    @RequestMapping("/deleteWord")
    public ModelAndView deleteWord(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            deleteService.deleteWord(Id);
            if(Id!=null){
                mav.setViewName("mainpage");
                mav.addObject("word_2021",word_2021Service.getAllWord_2021());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("mainpage");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("deleteWord");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/deleteArea")
    public ModelAndView deleteArea(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            deleteService.deleteArea(Id);
            if(Id!=null){
                mav.setViewName("guojia");
                mav.addObject("area",areaService.getAllArea());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("guojia");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("deleteArea");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/deleteIrverb")
    public ModelAndView deleteIrverb(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            deleteService.deleteIrverb(Id);
            if(Id!=null){
                mav.setViewName("dongci");
                mav.addObject("irverb",irverbService.getAllIrverb());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("dongci");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("deleteIrverb");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/deleteMonth")
    public ModelAndView deleteMonth(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            deleteService.deleteMonth(Id);
            if(Id!=null){
                mav.setViewName("monthandweek");
                mav.addObject("month",monthService.getAllMonth());
                mav.addObject("week",weekService.getAllWeek());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("monthandweek");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("deleteMonth");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/deleteNumeral")
    public ModelAndView deleteNumeral(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            deleteService.deleteNumeral(Id);
            if(Id!=null){
                mav.setViewName("shuci");
                mav.addObject("numeral",numeralService.getAllNumeral());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("shuci");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("deleteNumeral");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/deleteWeek")
    public ModelAndView deleteWeek(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            deleteService.deleteWeek(Id);
            if(Id!=null){
                mav.setViewName("monthandweek");
                mav.addObject("month",monthService.getAllMonth());
                mav.addObject("week",weekService.getAllWeek());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("monthandweek");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("deleteWeek");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }

    @RequestMapping("/deleteWord_s")
    public ModelAndView deleteWord_s(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(request.getMethod().equals("POST")) {
            Integer Id=Integer.valueOf(request.getParameter("Id"));
            deleteService.deleteWord_s(Id);
            if(Id!=null){
                mav.setViewName("shoucang");
                mav.addObject("word_s",word_sService.getAllWord_s());
                mav.addObject("loginUser",loginUser);
            }else{
                mav.setViewName("shoucang");
                mav.addObject("reg_failed",true);
            }
        }else{
            mav.setViewName("deleteWord_s");
            mav.addObject("reg_failed",false);
        }
        return mav;
    }
}
