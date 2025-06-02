package com.kickoffcalendar.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.util.List; 
import java.util.ArrayList;

@Entity//marks class as a table in relationship
@Data 
@Table(name="team") 
@NoArgsConstructor
public class Team {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremented DB ID
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String venue;

    private String country;

    @Column(name = "bucket_image_url")
    private String bucketImageUrl;

    @Column(name = "api_image_url")
    private String apiImageUrl;

    @Column(name = "api_id", nullable = false, unique = true)
    private Long apiID;

    // Relationship to Competition
    //@ManyToOne
    //@JoinColumn(name = "competition_id") // FK column in the table
    //private Competition competition;

}