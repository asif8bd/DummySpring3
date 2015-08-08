package net.softengine.school.admin.model.address;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("permanent")
public class PermanentAddress extends Address implements Serializable {


}
