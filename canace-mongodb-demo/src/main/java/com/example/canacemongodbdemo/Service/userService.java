package com.example.canacemongodbdemo.Service;

import com.example.canacemongodbdemo.Config.userMedul;

import java.util.List;

public interface userService {

    String save(userMedul user);

    List<userMedul> findAll();

    String select(long name);
}
