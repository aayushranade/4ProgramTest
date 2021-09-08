package com.example.loginSignup.controller;

import com.example.loginSignup.model.lsmodel;
import com.example.loginSignup.repository.lsrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
public class lscontroller {
    @Autowired
    lsmodel ModelObj;

    @Autowired
    lsrepository repositoryobj;

@PostMapping("/signup")
    public String signup(WebRequest webRequest){
    String username = webRequest.getParameter("username");
    String email = webRequest.getParameter("email");
    String password = webRequest.getParameter("password");
    String vpassword = webRequest.getParameter("vpassword");
    if(password == vpassword){
        repositoryobj.insertNewUser(username,email,password);
    }
    else{
        System.out.println("enter correct passwords");
    }
    return "Signup Success!!";
}
@PostMapping("/login")
    public String login(WebRequest webRequest){
    String username = webRequest.getParameter("username");
    String password = webRequest.getParameter("password");
    repositoryobj.getDetails(password);
    System.out.println("Hi" + username);
    return "login success";
}
}
