package com.example.finalproject.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "room_count")
public class RoomCount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String roomCount;
    boolean active;
}
