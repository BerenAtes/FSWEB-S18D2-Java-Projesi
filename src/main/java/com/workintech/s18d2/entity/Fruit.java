package com.workintech.s18d2.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "fruit",schema = "fsweb")
public class Fruit extends Plank {
    @Column(name = "fruit_type")
    @NotNull
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

}
