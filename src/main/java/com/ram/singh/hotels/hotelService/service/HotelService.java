package com.ram.singh.hotels.hotelService.service;

import com.ram.singh.hotels.hotelService.entities.Hotel;

import java.util.List;

public interface HotelService {
    // TODO: Add hotel service methods here
    // For example, methods to create, read, update, and delete hotels
    // create
    public Hotel saveHotel(Hotel hotel);
    // read
    public Hotel findHotelById(String hotelId);
    // update
    public Hotel updateHotel(Hotel hotel);
    // delete
    public void deleteHotelById(String hotelId);
    // getAll
    public List<Hotel> getAllHotels();

}
