package net.softengine.school.admin.model.address;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("present")
public class PresentAddress extends Address implements Serializable {


}
