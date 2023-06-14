package com.library.lolmodel.repository;

import com.library.lolmodel.models.SpellCooldown;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellCooldownRepository extends JpaRepository<SpellCooldown, Void>{

}