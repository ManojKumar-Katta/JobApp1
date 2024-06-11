package com.telusko.JobApp.model;


import java.util.List;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {


    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    public JobPost(int id, String title, String description, int experience, List<String> skills) {
        this.postId = id;
        this.postProfile = title;
        this.postDesc = description;
        this.reqExperience = experience;
        this.postTechStack = skills;
    }
}