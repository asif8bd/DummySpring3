package net.softengine.school.admin.model;


import net.softengine.school.admin.model.address.Address;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_INSTITUTION")
public class Institution  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne
    private Address address;


    @OneToMany
    @JoinTable(name = "AD_JT_INSTITUTION_BRANCH", joinColumns = @JoinColumn(name = "INST_IS"),
            inverseJoinColumns = @JoinColumn(name = "BR_ID"))
    private List<Branch> branchList = new ArrayList<Branch>();


}
