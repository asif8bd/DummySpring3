package net.softengine.school.admin.model.address;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AD_THANA")
public class Thana implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private District district;

    @OneToMany
    @JoinTable(name = "AD_JT_THANA_ADDRESS", joinColumns = @JoinColumn(name = "THANA_ID"),
            inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID"))
    private List<Address> addressList = new ArrayList<Address>();
}
