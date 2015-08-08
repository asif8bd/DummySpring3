package net.softengine.school.admin.model.address;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_REGION")
public class Region implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany
    @JoinTable(name = "AD_JT_REGION_COUNTRY", joinColumns = @JoinColumn(name = "COUNTRY_ID"),
            inverseJoinColumns = @JoinColumn(name = "DIVISION_ID"))
    private List<Country> countryList = new ArrayList<Country>();
}
