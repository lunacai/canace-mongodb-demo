package com.example.canacemongodbdemo.Config;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "canace_collection")
public class userMedul implements Serializable {
    @Id
    private long id;
    private String username;
    private String content;
    private String Updated_time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUpdated_time() {
        return Updated_time;
    }

    public void setUpdated_time(String updated_time) {
        Updated_time = updated_time;
    }

    @Override
    public String toString() {
        return "userMedul{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                ", Updated_time='" + Updated_time + '\'' +
                '}';
    }
}
