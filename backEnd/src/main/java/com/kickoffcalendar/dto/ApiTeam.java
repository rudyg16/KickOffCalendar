package com.kickoffcalendar.dto;
import java.time.ZonedDateTime;
public class ApiTeam {

    public record ApiTeamResponse(
        int id,
        String name,
        String shortName,
        String tla,
        String crest,
        String address,
        String website,
        int founded,
        String clubColors,
        String venue,
        ZonedDateTime lastUpdated
        
    ){

    }
    public record Filters(
        
    ){}
}
