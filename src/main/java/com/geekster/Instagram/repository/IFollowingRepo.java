package com.geekster.Instagram.repository;

import com.geekster.Instagram.model.InstagramFollowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowingRepo extends JpaRepository<InstagramFollowing, Long> {

    Long countByUser_userId(long userId);
}
