package com.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by cmatei on 16.02.2017.
 */

@Entity
@Table(name="ROLE")
public class Role extends BaseEntity {

    @Column(name = "ROLE", length = 50, nullable = false)
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
