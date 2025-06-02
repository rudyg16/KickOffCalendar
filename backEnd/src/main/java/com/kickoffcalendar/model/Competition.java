package com.kickoffcalendar.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity // marks class as a table in relationship
@Data
@Table(name = "competition")
@NoArgsConstructor
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremented DB ID
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(name="competition_type",nullable=false)
    private String competitionType;
    @Column
    private String code;
    @Column(name="bucket_image_url")
    private String bucketImageUrl;

    @Column(name="api_image_url")
    private String apiImageUrl;
    
    @Column(name="api_id",nullable=false)
    private String apiId;

}
