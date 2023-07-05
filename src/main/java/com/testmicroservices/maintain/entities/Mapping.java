package com.testmicroservices.maintain.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "mapping")
public class Mapping {

    @Id
    private String id;
    //@GeneratedValue (strategy = GenerationType.IDENTITY)
    //private Long id;

    @Column
    private String associateId;

    @Column
    private String skillId;

    @Column
    private String rating;

    public String toString()
    {
        return "\n\n MAPPING TABLE DATA\n" + id + " | " + associateId + " | " + skillId + " | " + rating ;
    }
}
