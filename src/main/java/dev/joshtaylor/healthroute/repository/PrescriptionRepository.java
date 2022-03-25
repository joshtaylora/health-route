package dev.joshtaylor.healthroute.repository;

import dev.joshtaylor.healthroute.domain.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long>
{}
