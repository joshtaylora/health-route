package dev.joshtaylor.healthroute.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "prescription")
@RequiredArgsConstructor

public class Prescription
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "startDate", nullable = false)
    private java.sql.Date startDate;

    @Column(name = "endDate", nullable = false)
    private java.sql.Date endDate;

    @Column(name = "remainingDoses", nullable = false)
    private int remainingDoses;

    @Column(name = "strength", nullable = false)
    private int strength;



}
