package com.example.BookStore.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name ="users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private  long id;

    private String username;
    private String userpw;
    private String userinfo;

}
