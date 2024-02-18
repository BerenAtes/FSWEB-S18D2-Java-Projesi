package com.workintech.s18d2.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vegatable",schema = "fsweb")
public class Vegatables extends Plank{
    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;

}
