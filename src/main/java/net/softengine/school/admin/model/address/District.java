package net.softengine.school.admin.model.address;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_DISTRICT")
public class District implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private Division division;

    @OneToMany
    @JoinTable(name = "AD_JT_DISTRICT_THANA", joinColumns = @JoinColumn(name = "DISTRICT_ID"),
    inverseJoinColumns = @JoinColumn(name = "THANA_ID"))
    private List<Thana> thanaList = new ArrayList<Thana>();


}
