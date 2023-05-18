package com.geekster.Instagram.service;


import com.geekster.Instagram.model.InstagramFollower;
import com.geekster.Instagram.model.User;
import com.geekster.Instagram.repository.IFollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {

    @Autowired
    IFollowerRepo followerRepo;

    public void saveFollower(User myUser, User otherUser) {


        InstagramFollower follower = new InstagramFollower(null,myUser,otherUser);

        followerRepo.save(follower);
    }
}
