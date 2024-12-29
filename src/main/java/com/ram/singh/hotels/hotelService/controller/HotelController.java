package com.ram.singh.hotels.hotelService.controller;

import com.ram.singh.hotels.hotelService.entities.Hotel;
import com.ram.singh.hotels.hotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    // Add hotel related API endpoints here
    // For example, GET /hotels, GET /hotels/{id}, POST /hotels, PUT /hotels/{id}, DELETE /hotels/{id}
    @Autowired
    private HotelService hotelService;
    @PostMapping
    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel) {
        return  ResponseEntity.status(HttpStatus.CREATED).body(hotelService.saveHotel(hotel));
    }

}
