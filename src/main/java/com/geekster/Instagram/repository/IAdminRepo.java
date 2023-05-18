package com.geekster.Instagram.repository;

import com.geekster.Instagram.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin, Long> {
}
