package com.example.project_english.controller;

import com.example.project_english.bean.User;
import com.example.project_english.bean.Irverb;
import com.example.project_english.bean.Word_2021;
import com.example.project_english.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class RouterController {
    @Autowired
    UserService userService;
    @Autowired
    Word_2021Service word_2021Service;
    @Autowired
    AreaService areaService;
    @Autowired
    NumeralService numeralService;
    @Autowired
    IrverbService irverbService;
    @Autowired
    MonthService monthService;
    @Autowired
    WeekService weekService;
    @Autowired
    Word_sService word_sService;

    @GetMapping("")
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("/mainpage");
    }

    //主页
    @GetMapping("/mainpage")
    public ModelAndView mainpage(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(loginUser!=null){
            mav.setViewName("mainpage");
            mav.addObject("word_2021",word_2021Service.getAllWord_2021());
            mav.addObject("loginUser",loginUser);
        }else{
            mav.setViewName("login");
        }
        return mav;
    }

    //国家和地区
    @GetMapping("/guojia")
    public ModelAndView guojia(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(loginUser!=null){
            mav.setViewName("guojia");
            mav.addObject("area",areaService.getAllArea());
            mav.addObject("loginUser",loginUser);
        }else{
            mav.setViewName("login");
        }
        return mav;
    }

    //数词表
    @GetMapping("/shuci")
    public ModelAndView shuci(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(loginUser!=null){
            mav.setViewName("shuci");
            mav.addObject("numeral",numeralService.getAllNumeral());
            mav.addObject("loginUser",loginUser);
        }else{
            mav.setViewName("login");
        }
        return mav;
    }

    //月份和星期
    @GetMapping("/monthandweek")
    public ModelAndView monthandweek(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(loginUser!=null){
            mav.setViewName("monthandweek");
            mav.addObject("month",monthService.getAllMonth());
            mav.addObject("week",weekService.getAllWeek());
            mav.addObject("loginUser",loginUser);
        }else{
            mav.setViewName("login");
        }
        return mav;
    }

    //不规则动词
    @GetMapping("/dongci")
    public ModelAndView dongci(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(loginUser!=null){
            mav.setViewName("dongci");
            mav.addObject("irverb",irverbService.getAllIrverb());
            mav.addObject("loginUser",loginUser);
        }else{
            mav.setViewName("login");
        }
        return mav;
    }

    //收藏页面
    @GetMapping("/shoucang")
    public ModelAndView shoucang(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        if(loginUser!=null){
            mav.setViewName("shoucang");
            mav.addObject("word_s",word_sService.getAllWord_s());
            mav.addObject("loginUser",loginUser);
        }else{
            mav.setViewName("login");
        }
        return mav;
    }

    //搜索页面
    @GetMapping("/search")
    public ModelAndView Search(HttpServletRequest request,HttpServletResponse response){
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        String key=request.getParameter("key");
        if(loginUser!=null){
            mav.setViewName("search");
            mav.addObject("loginUser",loginUser);
            List<Word_2021> result=word_2021Service.search(key);
            mav.addObject("result",result);
        }else{
            mav.setViewName("login");
        }
        return mav;
    }

    //搜索不规则动词页面
    @GetMapping("/searchIrverb")
    public ModelAndView SearchIrverb(HttpServletRequest request,HttpServletResponse response){
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        String key=request.getParameter("key");
        if(loginUser!=null){
            mav.setViewName("searchIrverb");
            mav.addObject("loginUser",loginUser);
            List<Irverb> result=irverbService.search(key);
            mav.addObject("result",result);
        }else{
            mav.setViewName("login");
        }
        return mav;
    }

    //搜索收藏页面
    @GetMapping("/searchWord_s")
    public ModelAndView SearchWord_s(HttpServletRequest request,HttpServletResponse response){
        ModelAndView mav=new ModelAndView();
        User loginUser= userService.checkCookie(request.getCookies());
        String key=request.getParameter("key");
        if(loginUser!=null){
            mav.setViewName("searchWord_s");
            mav.addObject("loginUser",loginUser);
            List<Word_2021> result=word_sService.search(key);
            mav.addObject("result",result);
        }else{
            mav.setViewName("login");
        }
        return mav;
    }

}
