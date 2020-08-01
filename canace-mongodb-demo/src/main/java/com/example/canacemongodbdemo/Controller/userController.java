package com.example.canacemongodbdemo.Controller;

import com.example.canacemongodbdemo.Config.userMedul;
import com.example.canacemongodbdemo.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/use")
public class userController {
    @Autowired
    userService userService;

    @GetMapping("/save/{ids}")
    public String save(@PathVariable long ids){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        userMedul user = new userMedul();
        user.setId(ids);
        user.setUsername("username"+ids);
        user.setContent("content-"+ids);
        user.setUpdated_time(formatter.format(date));
        return userService.save(user);
    }

    @RequestMapping("/query")
    public List<userMedul> query(){
        List<userMedul> list= userService.findAll();
        return list;
    }

}
