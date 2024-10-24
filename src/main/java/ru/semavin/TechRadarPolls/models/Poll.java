package ru.semavin.TechRadarPolls.models;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "polls")
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long poll_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tech_id", nullable = false)
    private Technology technology;

    @ManyToOne(fetch = FetchType.LAZY) // Связь с Ring
    @JoinColumn(name = "ring_id", nullable = false)
    private Ring ring;


    @Column(nullable = false)
    private LocalDateTime time;
}