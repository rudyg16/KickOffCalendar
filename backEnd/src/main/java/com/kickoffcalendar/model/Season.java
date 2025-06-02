package com.kickoffcalendar.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "season")
@Data
@NoArgsConstructor
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "api_id", nullable = false, unique = true)
    private Integer apiId;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competition;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "current_matchday")
    private Integer currentMatchday;

    @ManyToOne
    @JoinColumn(name = "winner_id")
    private Team winner;
}
