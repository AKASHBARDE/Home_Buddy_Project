package com.home_buddy_backend.managment.Repo;

import com.home_buddy_backend.managment.Entity.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperAdminRepository extends JpaRepository<SuperAdmin, Long> {


}
