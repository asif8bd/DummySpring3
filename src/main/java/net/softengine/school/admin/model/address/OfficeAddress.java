package net.softengine.school.admin.model.address;



import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("office")
public class OfficeAddress extends Address implements Serializable {


}
