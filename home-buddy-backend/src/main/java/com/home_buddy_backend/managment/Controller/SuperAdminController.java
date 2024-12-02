package com.home_buddy_backend.managment.Controller;

import com.home_buddy_backend.managment.Entity.SuperAdmin;
import com.home_buddy_backend.managment.Repo.SuperAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/super-admins")
public class SuperAdminController {

    @Autowired
    private SuperAdminRepository superAdminRepository;

    @GetMapping
    public List<SuperAdmin> getAllSuperAdmins() {
        return superAdminRepository.findAll();
    }

    @PostMapping
    public SuperAdmin createSuperAdmin(@RequestBody SuperAdmin superAdmin) {
        return superAdminRepository.save(superAdmin);
    }
}
