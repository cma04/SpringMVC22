package com.springapp.model;

import javax.persistence.*;

/**
 * Created by cmatei on 16.02.2017.
 */

@Entity
@Table(name="USER")
public class User extends BaseEntity {

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "PASSWORD", length = 50)
    private String password;

    @ManyToOne(optional = true)
    @JoinColumn(name = "ROLE", nullable = true)
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
