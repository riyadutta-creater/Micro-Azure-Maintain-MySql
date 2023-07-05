package com.testmicroservices.maintain.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "associate")
public class Associate {

    @Id
    @Column
    private String id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private String mobile;

    @Column
    private String email;

    @Column
    private String lastUpdated;

    @Column
    private String password;

    @Column
    private String role;


    public String toString()
    {
        return "\n\n ASSOCIATE DATA\n" + id + " | " + username + " | " + name + " | " + mobile + " | " + email + " | "
                + lastUpdated + " | " + password + " | " + role;
    }
}
