package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Vegatables;
import jakarta.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegatableRepository extends JpaRepository<Vegatables,Long> {
@Query(value = "SELECT v.id,v.name,v.price,v.is_grown_on_tree FROM fsweb.vegatables as v ORDER BY v.price DESC",nativeQuery = true)
    List<Vegatables> getByPricesDesc();

    @Query(value = "SELECT v.id,v.name,v.price,v.is_grown_on_tree FROM fsweb.vegatables as v ORDER BY v.price ASC",nativeQuery = true)
    List<Vegatables> getByPricesAsc();

    @Query("SELECT v FROM Vegatables v where v.name ILIKE %:name%")
    List<Vegatables> searchByName(String name);
}
