package dev.saitheja.BookMyShow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "ACTOR")
@Getter
@Setter
public class Actor extends BaseModel{
    //@Column(name = "ACTOR_NAME")
    private String name;
    @ManyToMany
    private List<Movie> movies;
}
