package com.kickoffcalendar.dto;

import java.time.ZonedDateTime;
import com.kickoffcalendar.dto.ApiTeam;

import java.time.ZonedDateTime;
import com.kickoffcalendar.dto.ApiTeam;
import com.kickoffcalendar.dto.ApiArea;

public class ApiCompetition {
    public record ApiCurrentSeasonResponse(
        int id,
        ZonedDateTime startDate,
        ZonedDateTime endDate,
        int currentMatchday,
        ApiTeamResponse winner
    ){}

    public record ApiCompetitionResponse(
        int id,
        ApiAreaResponse area,
        String name,
        String code,
        String type,
        String eblem,
        String plan,
        ApiCurrentSeasonResponse currentSeason,
        int numberofAvailableSeasons,
        ZonedDateTime lastUpdated
    ){}
    

}

public class ApiCompetition {
    public record ApiCurrentSeasonResponse(
        int id,
        ZonedDateTime startDate,
        ZonedDateTime endDate,
        int currentMatchday,
        ApiTeamResponse winner
    ){}

    public record ApiCompetitionResponse(
        int id,
        ApiAreaResponse area,
        String name,
        String code,
        String type,
        String eblem,
        String plan,
        ApiCurrentSeasonResponse currentSeason,
        int numberofAvailableSeasons,
        ZonedDateTime lastUpdated
    ){}
    

}
