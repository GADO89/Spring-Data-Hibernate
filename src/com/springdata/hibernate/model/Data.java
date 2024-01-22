package com.springdata.hibernate.model;


import javax.persistence.*;

@Entity
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
    private Long id;

    @Column(name = "person_age")
    private String age;


    @OneToOne(mappedBy = "data", cascade = {CascadeType.ALL,CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    private Person person;


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Data() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
