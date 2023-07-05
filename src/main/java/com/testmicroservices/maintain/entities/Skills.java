package com.testmicroservices.maintain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "skills")
public class Skills {

    @Id
    private String skillId;

    @Column
    private String skillName;

    public String toString()
    {
        return "\n\n MAPPING TABLE DATA\n" + skillId + " | " + skillName ;
    }
}