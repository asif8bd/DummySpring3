package net.softengine.school.security.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SEC_TOKEN", uniqueConstraints= @UniqueConstraint(columnNames = {"username"}))
public class Token  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;

    private String username;

    private String password;

    @OneToOne(mappedBy = "token")
    private User user;




}
