package dev.saitheja.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class City extends BaseModel{
    private String name;
    @OneToMany
    private List<Theatre> theatres;
}
