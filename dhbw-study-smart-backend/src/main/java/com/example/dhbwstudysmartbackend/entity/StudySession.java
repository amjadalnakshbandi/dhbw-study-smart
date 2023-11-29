package com.example.dhbwstudysmartbackend.entity;
import com.example.dhbwstudysmartbackend.service.AppointmentService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudySession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studySessionId;

    private Time flashcardTime;

    @ManyToOne
    @JoinColumn(name = "appointment_id", nullable = true)
    private Appointment appointment;
}

