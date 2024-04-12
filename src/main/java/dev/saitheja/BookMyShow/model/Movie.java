package dev.saitheja.BookMyShow.model;

import dev.saitheja.BookMyShow.model.constants.MovieFeature;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    private String description;
    @OneToMany
    private List<Actor> actors;
    @Enumerated(EnumType.STRING)
    private MovieFeature movieFeature;
}
