package com.bbh.repositories;

import com.bbh.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository  extends JpaRepository<Booking, Long>{

    public Booking findByName(String name);
}
