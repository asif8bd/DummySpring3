package net.softengine.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ayatullah213574 on 04/08/2015.
 */

@Entity
public class TestEntity {
    @Id
    private Long id;


    private String name;


}
