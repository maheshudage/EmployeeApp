package com.tka.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Component //object -->bean
@Entity
public class Users {
	@Id
	private int id;
    private String username;
    private String password;
    private String email;
    private String role;
    private String mobile;
}
