package org.acme.getting.started;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.QueryHint;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
@NamedQuery(name = "findAll", query = "SELECT g FROM GreetingEntity g ORDER BY g.name")
public class GreetingEntity {

    @Id
    @SequenceGenerator(name = "greetingSequence", sequenceName = "greeting_id_seq", allocationSize = 1, initialValue = 10)
    @GeneratedValue(generator = "greetingSequence")
    private Integer id;

    @Column(length = 40, unique = true)
    private String name;

    public GreetingEntity() {
    }

    public GreetingEntity(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
