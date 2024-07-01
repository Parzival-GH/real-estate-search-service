package com.example.finalproject.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    boolean active;

    @ManyToOne
    @JoinColumn(name = "location_type_id")
    LocationType locationType;

    @ManyToOne
    @JoinColumn(name = "location_id")
    Location location;

}
