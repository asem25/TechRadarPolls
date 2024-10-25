package ru.semavin.TechRadarPolls.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.semavin.TechRadarPolls.models.Ring;

import java.util.Optional;

@Repository
public interface RingRepository extends JpaRepository<Ring, Integer> {
    Optional<Ring> findByRingName(String name);
}
