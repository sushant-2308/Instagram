package com.geekster.Instagram.repository;

import com.geekster.Instagram.model.InstagramFollower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowerRepo extends JpaRepository<InstagramFollower, Long> {


}
