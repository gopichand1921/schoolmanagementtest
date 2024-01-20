package com.schoolmanagement.repository;

import com.schoolmanagement.entity.admins.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admins,Integer> {
}
