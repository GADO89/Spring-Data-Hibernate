package com.springdata.hibernate.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

     @ManyToMany(cascade = {CascadeType.DETACH,
             CascadeType.MERGE,
             CascadeType.PERSIST,
             CascadeType.REFRESH
     },fetch = FetchType.EAGER)
     @JoinTable(
             name = "car_color",
             joinColumns = @JoinColumn(name = "color_id"),
             inverseJoinColumns = @JoinColumn(name = "car_id")
     )
    private List<Car> cars=new ArrayList<Car>();

    public Color() {
    }

    public Color(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
