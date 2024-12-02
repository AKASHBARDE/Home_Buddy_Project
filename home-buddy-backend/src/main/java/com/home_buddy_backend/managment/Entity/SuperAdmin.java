package com.home_buddy_backend.managment.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="SuperAdmin")
public class SuperAdmin {

    @Id
    @NotNull
    @Column(name = "Super_id")
    private Long id;




}
