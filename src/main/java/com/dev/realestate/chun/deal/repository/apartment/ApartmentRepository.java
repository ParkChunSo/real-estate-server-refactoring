package com.dev.realestate.chun.deal.repository.apartment;

import com.dev.realestate.chun.entitys.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
