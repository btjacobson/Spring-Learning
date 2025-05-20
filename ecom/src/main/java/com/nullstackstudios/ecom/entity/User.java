package com.nullstackstudios.ecom.entity;

import com.nullstackstudios.ecom.enums.UserRoles;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private String password;

    private String name;

    private UserRoles role;

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] image;
}
