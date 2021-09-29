package com.userdetail.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailController {
    @RequestMapping("/UserDetailApplication")
    public String detail() {

        String userDetail = "Name: Pooja Kumari Singh \n
                             Profile: FrameWork Engineer SD \n
                             Company: Quantiphi \n
                             Location: Banglore";

        return userDetail;
    }
}