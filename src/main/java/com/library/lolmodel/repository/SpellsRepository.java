package com.library.lolmodel.repository;

import com.library.lolmodel.models.Spells;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellsRepository extends JpaRepository<Spells, String>{

}