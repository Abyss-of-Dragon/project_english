package com.example.project_english.controller;

import com.example.project_english.bean.User;
import com.example.project_english.service.DeleteService;
import com.example.project_english.service.UserService;
import com.example.project_english.service.Word_2021Service;
import org.springframework.beans.factory.annotation.Autowired;
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
}
