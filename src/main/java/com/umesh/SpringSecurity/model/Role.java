package com.umesh.SpringSecurity.model;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * Created by umesh on 8/22/17.
 */

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;


    @Column(name = "role_name")
    private String roleName;


    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for property 'roleName'.
     *
     * @return Value for property 'roleName'.
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Setter for property 'roleName'.
     *
     * @param roleName Value to set for property 'roleName'.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
