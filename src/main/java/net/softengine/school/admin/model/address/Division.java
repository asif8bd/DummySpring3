package net.softengine.school.admin.model.address;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_DIVISION")
public class Division implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private Country country;

    @OneToMany
    @JoinTable(name = "AD_JT_DIVISION_DISTRICT", joinColumns = @JoinColumn(name = "DIVISION_ID"),
            inverseJoinColumns = @JoinColumn(name = "DISTRICT_ID"))
    private List<District> districtList = new ArrayList<District>();
}
