package com.library.lolmodel.repository;

import com.library.lolmodel.models.SpellEffect;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SpellEffectRepository extends JpaRepository<SpellEffect, String>{
    List<SpellEffect> findAllByChampionName(String championName);

    Optional<SpellEffect> findById(String championName);
}