package com.kickoffcalendar.repository;

import com.kickoffcalendar.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface TeamRepository extends JpaRepository<Team,Long>{//first param is entity type(class that maps to entity in DB), second is type of the identifier(primary key)
    @Query(value = "SELECT * FROM teams",nativeQuery=true)
    List<Team> findAllTeams();

    @Query(value = "SELECT * FROM teams WHERE name=:name ",nativeQuery=true)
    List<Team> findbyName(@Param("name") String name);

    @Query (value ="SELECT * FROM teams WHERE country=:country",nativeQuery=true)
    List<Team> findbyCountry(@Param("country")String country);

}
