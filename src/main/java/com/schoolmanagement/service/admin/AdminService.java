package com.schoolmanagement.service.admin;

import com.schoolmanagement.entity.admins.Admins;

import java.util.List;

public interface AdminService {
    Admins add(Admins admins);

    List<Admins> getall();
}
