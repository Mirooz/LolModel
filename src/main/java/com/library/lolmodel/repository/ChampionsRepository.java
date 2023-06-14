package com.library.lolmodel.repository;

import com.library.lolmodel.models.Champions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ChampionsRepository extends JpaRepository<Champions, String>{

}