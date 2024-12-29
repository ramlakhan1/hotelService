package com.ram.singh.hotels.hotelService.repository;

import com.ram.singh.hotels.hotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
