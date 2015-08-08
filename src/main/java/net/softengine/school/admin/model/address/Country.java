package net.softengine.school.admin.model.address;



import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_COUNTRY")
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private Region region;

    @OneToMany
    @JoinTable(name = "AD_JT_COUNTRY_DIVISION", joinColumns = @JoinColumn(name = "COUNTRY_ID"),
            inverseJoinColumns = @JoinColumn(name = "DIVISION_ID"))
    private List<Division> divisionList = new ArrayList<Division>();
}
