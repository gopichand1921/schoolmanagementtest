package com.schoolmanagement.serviceimpl.admin;

import com.schoolmanagement.entity.admins.Admins;
import com.schoolmanagement.repository.AdminRepository;
import com.schoolmanagement.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminRepository adminRepository;
    @Override
    public Admins add(Admins admins) {
        return adminRepository.save(admins) ;
    }

    @Override
    public List<Admins> getall() {
        return adminRepository.findAll();
    }
}
