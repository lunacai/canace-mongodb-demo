package com.example.canacemongodbdemo.Service;

import com.example.canacemongodbdemo.Config.userMedul;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class userServiceImpl implements userService{

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public String save(userMedul user){
        System.out.println(user.toString());
        mongoTemplate.save(user);
        return "save successful";
    }
    @Override
    public String select(long name){
        Query query=new Query(Criteria.where("id").is(name));
        userMedul user =  mongoTemplate.findOne(query , userMedul.class);
        return user.toString();
    }

    @Override
    public List<userMedul> findAll() {
        List<userMedul> all = mongoTemplate.findAll(userMedul.class,"canace_collection");
        System.out.println(all);
        return all;
    }
}
