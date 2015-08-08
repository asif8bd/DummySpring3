package net.softengine.school.admin.model;


import net.softengine.school.admin.model.address.Address;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_Branch")
public class Branch  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne
    private Address address;

    @ManyToOne
    private Institution institution;

    @OneToMany
    @JoinTable(name = "AD_JT_BRANCH_CLASS", joinColumns = @JoinColumn(name = "BR_ID"),
            inverseJoinColumns = @JoinColumn(name = "CLASS_ID"))
    private List<Klass> classList = new ArrayList<Klass>();
}
