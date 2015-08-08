package net.softengine.school.admin.model.address;

import net.softengine.school.admin.model.Branch;
import net.softengine.school.admin.model.Institution;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "address_type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("general")
@Table(name = "AD_ADDRESS")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String addressLineOne;

    private String addressLineTwo;

    private String phone;

    private String email;

    @ManyToOne
    private Thana thana;

    @OneToOne(mappedBy = "address")
    private Institution institution;

    @OneToOne(mappedBy = "address")
    private Branch branch;

}
