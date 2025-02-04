package com.example.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data // Lombok annotation (generates getters/setters)
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
