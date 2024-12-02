package com.home_buddy_backend.managment.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Customer_Formating1")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "super_admin_id" , nullable = false)
    private SuperAdmin superAdmin;

}
